package com.avatech.edi.akcrm.mapper;

import com.avatech.edi.akcrm.model.bo.SaleOrder.SaleOrder;
import com.avatech.edi.akcrm.model.bo.SaleOrder.SalesOrderLine;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SalesOrderMapper {
    void insertSalesOrder(SaleOrder SalesOrder);

     List<SaleOrder>  searchSalesOrder();

    void insertSalesOrderLine(SalesOrderLine SalesOrderLine);

    List<SalesOrderLine> searchSalesOrderLine(String docEntry);

    void updateSaleOrder (String docEntry);
}
