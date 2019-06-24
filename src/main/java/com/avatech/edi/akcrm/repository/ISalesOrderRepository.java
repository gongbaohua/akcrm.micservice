package com.avatech.edi.akcrm.repository;

import com.avatech.edi.akcrm.model.bo.SaleOrder.SaleOrder;
import com.avatech.edi.akcrm.model.bo.SaleOrder.SalesOrderLine;

import java.util.List;

public interface ISalesOrderRepository {
    void saveSalesOrder(SaleOrder salesOrder);

    List<SaleOrder> fetchSalesOrders();

    void saveSalesOrderLine(SalesOrderLine salesOrderLine);

     List<SalesOrderLine> fetchSalesOrderLines(String docEntry);
}
