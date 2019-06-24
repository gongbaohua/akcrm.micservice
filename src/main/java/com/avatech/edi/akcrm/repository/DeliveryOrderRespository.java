package com.avatech.edi.akcrm.repository;

import com.avatech.edi.akcrm.model.bo.deliveryorder.StockDeliveryItem;
import com.avatech.edi.akcrm.model.bo.deliveryorder.StockDeliveryOrder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DeliveryOrderRespository {
    void saveStockDeliveryOrder(StockDeliveryOrder StockDeliveryOrder);

    List<StockDeliveryOrder> fetchStockDeliveryOrders();

    void saveStockDeliveryItem(StockDeliveryItem StockDeliveryItem);

    List<StockDeliveryItem> fetchStockDeliveryItems();
}
