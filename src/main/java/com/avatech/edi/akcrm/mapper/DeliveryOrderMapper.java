package com.avatech.edi.akcrm.mapper;

import com.avatech.edi.akcrm.model.bo.deliveryorder.StockDeliveryItem;
import com.avatech.edi.akcrm.model.bo.deliveryorder.StockDeliveryOrder;

import java.util.List;

public interface DeliveryOrderMapper {
    void insertStockDeliveryOrder(StockDeliveryOrder StockDeliveryOrder);

    List<StockDeliveryOrder> searchStockDeliveryOrder();

    void insertStockDeliveryItem(StockDeliveryItem StockDeliveryItem);

    List<StockDeliveryItem> searchStockDeliveryItem(String docEntry);
}
