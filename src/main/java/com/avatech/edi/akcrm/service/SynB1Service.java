package com.avatech.edi.akcrm.service;

import com.avatech.edi.akcrm.B1JCO.B1Manager;
import com.avatech.edi.akcrm.B1JCO.bean.B1Connection;
import com.avatech.edi.akcrm.model.bo.SaleOrder.SaleOrder;
import com.avatech.edi.akcrm.model.bo.deliveryorder.StockDeliveryOrder;
import com.avatech.edi.akcrm.model.bo.purchaseorder.BusinessPartner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SynB1Service {
    @Autowired
    private B1Manager b1Manager;
    @Autowired
    private SaleOrderService saleOrderService;

    @Autowired
    private StockDeliveryOrderService stockDeliveryOrderService;

    @Autowired
    private BusinessPartnerService businessPartnerService;

    public String getSalesOrder(SaleOrder saleOrder){
        B1Connection connection = b1Manager.getB1ConnInstance(saleOrder.getBuyCard());
        return saleOrderService.CreateSaleOrder(saleOrder,connection);
    }
    public String getStockDeliveryOrder(StockDeliveryOrder stockDeliveryOrder){
        B1Connection connection = b1Manager.getB1ConnInstance(stockDeliveryOrder.getCardCode());
        return stockDeliveryOrderService.CreateStockDeliveryOrder(stockDeliveryOrder,connection);
    }
    public String syncToB1(BusinessPartner businessPartner){
        B1Connection connection = b1Manager.getB1ConnInstance(businessPartner.getCellular());
        return  businessPartnerService.operatitonB1Order(businessPartner,connection);

    }
}
