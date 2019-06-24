package com.avatech.edi.akcrm.api;

import com.avatech.edi.akcrm.B1JCO.B1Manager;
import com.avatech.edi.akcrm.model.bo.ResultData;
import com.avatech.edi.akcrm.model.bo.SaleOrder.SaleOrder;
import com.avatech.edi.akcrm.repository.imp.SalesOrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/*")
@Slf4j
public class SaleOrderController {
    @Autowired
    private SalesOrderRepository salesOrderRepository;

    @PostMapping("sales")
    public @ResponseBody  ResultData generateSaleOrder(@RequestBody SaleOrder saleOrder){
        ResultData resultData = new ResultData();
        log.info("接收销售订单"+saleOrder.toString());
        salesOrderRepository.saveSalesOrder(saleOrder);
        return resultData;
    }
}
