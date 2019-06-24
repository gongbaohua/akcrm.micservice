package com.avatech.edi.akcrm.repository.imp;

import com.avatech.edi.akcrm.mapper.DeliveryOrderMapper;
import com.avatech.edi.akcrm.model.bo.deliveryorder.StockDeliveryItem;
import com.avatech.edi.akcrm.model.bo.deliveryorder.StockDeliveryOrder;
import com.avatech.edi.akcrm.repository.DeliveryOrderRespository;
import com.avatech.edi.akcrm.tools.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class DeliveryOrderRespositoryimp implements DeliveryOrderRespository {
    @Autowired
    private DeliveryOrderMapper deliveryOrderMapper;

    @Override
    public void saveStockDeliveryOrder(StockDeliveryOrder stockDeliveryOrder) {
        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        Long docEntry;
        docEntry = idWorker.nextId();
        stockDeliveryOrder.setDocEntry(docEntry);
        deliveryOrderMapper.insertStockDeliveryOrder(stockDeliveryOrder);
        for (StockDeliveryItem stockDeliveryItem : stockDeliveryOrder.getSockDeliveryItems()){
            stockDeliveryItem.setDocEntry(docEntry);
        }
    }

    @Override
    public List<StockDeliveryOrder> fetchStockDeliveryOrders() {
        List<StockDeliveryOrder> stockDeliveryOrders = new ArrayList<>();
        stockDeliveryOrders = deliveryOrderMapper.searchStockDeliveryOrder();
        for (StockDeliveryOrder deliveryOrder : stockDeliveryOrders){
            deliveryOrder.getSockDeliveryItems().addAll((deliveryOrderMapper.searchStockDeliveryItem(deliveryOrder.getDocEntry().toString())));

        }
        return stockDeliveryOrders;
    }

    @Override
    public void saveStockDeliveryItem(StockDeliveryItem stockDeliveryItem) {


    }

    @Override
    public List<StockDeliveryItem> fetchStockDeliveryItems() {
        return  null;
    }
}
