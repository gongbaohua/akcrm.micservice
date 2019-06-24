package com.avatech.edi.akcrm.api.job;

import com.avatech.edi.akcrm.model.bo.deliveryorder.StockDeliveryOrder;
import com.avatech.edi.akcrm.repository.DeliveryOrderRespository;
import com.avatech.edi.akcrm.service.SynB1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Slf4j
public class StockDeliveryOrderJob {
    @Autowired
    private DeliveryOrderRespository deliveryOrderRespository;

    @Autowired
    private SynB1Service synB1Service;

    public void process(){
       List<StockDeliveryOrder>stockDeliveryOrders = null;
        stockDeliveryOrders = deliveryOrderRespository.fetchStockDeliveryOrders();
        if (stockDeliveryOrders.size()==0||stockDeliveryOrders==null){
            return;
        }
        for (StockDeliveryOrder stockDeliveryOrder : stockDeliveryOrders){
            String docEntry = synB1Service.getStockDeliveryOrder(stockDeliveryOrder);
            log.info(docEntry+"生成库存发货单成功");
        }

    }
}
