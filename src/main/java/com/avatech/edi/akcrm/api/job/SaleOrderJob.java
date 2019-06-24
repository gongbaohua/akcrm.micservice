package com.avatech.edi.akcrm.api.job;

import com.avatech.edi.akcrm.B1JCO.B1Manager;
import com.avatech.edi.akcrm.model.bo.SaleOrder.SaleOrder;
import com.avatech.edi.akcrm.model.bo.SaleOrder.SalesOrderLine;
import com.avatech.edi.akcrm.repository.imp.SalesOrderRepository;
import com.avatech.edi.akcrm.service.SaleOrderService;
import com.avatech.edi.akcrm.service.SynB1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class SaleOrderJob {
    @Autowired
    private SalesOrderRepository salesOrderRepository;

    @Autowired
    private SynB1Service synB1Service;


    @Scheduled(cron = "0 0/1 * * * ?")
    private void process(){
        List<SaleOrder>saleOrders = null;
        saleOrders = salesOrderRepository.fetchSalesOrders();
        try {
            if (saleOrders.size()==0||saleOrders==null){
                return;
            }
            for (SaleOrder saleOrder :saleOrders){
                String docEntry= synB1Service.getSalesOrder(saleOrder);
                log.info("生成销售订单成功"+docEntry);
                //1.更新中间表IsSync为Y，把docEntry写入表里
            }
        }catch (Exception e){
            log.error("生成销售订单失败");
        }
    }

}
