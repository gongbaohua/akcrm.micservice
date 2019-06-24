package com.avatech.edi.akcrm.repository.imp;

import com.avatech.edi.akcrm.mapper.SalesOrderMapper;
import com.avatech.edi.akcrm.model.bo.SaleOrder.SaleOrder;
import com.avatech.edi.akcrm.model.bo.SaleOrder.SalesOrderLine;
import com.avatech.edi.akcrm.repository.ISalesOrderRepository;
import com.avatech.edi.akcrm.tools.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class SalesOrderRepository implements ISalesOrderRepository {
    @Autowired
    private SalesOrderMapper salesOrderMapper;

    @Override
    public void saveSalesOrder(SaleOrder salesOrder) {
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        Long docEntry;
        docEntry = idWorker.nextId();
        salesOrder.setDocEntry(docEntry);
        salesOrderMapper.insertSalesOrder(salesOrder);
        for (SalesOrderLine salesOrderLine : salesOrder.getsalesOrderLines()){
            salesOrderLine.setDocEntry(docEntry);
            salesOrderMapper.insertSalesOrderLine(salesOrderLine);
        }
    }

    @Override
    public List<SaleOrder>  fetchSalesOrders() {
        List<SaleOrder> saleOrders = new ArrayList<>();
        saleOrders = salesOrderMapper.searchSalesOrder();
        for (SaleOrder saleOrder: saleOrders){
            saleOrder.getsalesOrderLines().addAll(salesOrderMapper.searchSalesOrderLine(saleOrder.getDocEntry().toString()));
        }
        return saleOrders;
    }

    @Override
    public void saveSalesOrderLine(SalesOrderLine salesOrderLine) {
            salesOrderMapper.insertSalesOrderLine(salesOrderLine);
    }

    @Override
    public List<SalesOrderLine> fetchSalesOrderLines(String docEntry) {

        return null;
    }
}
