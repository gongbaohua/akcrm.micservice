/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-03
 */
package com.avatech.edi.akcrm.api;

import com.avatech.edi.akcrm.B1JCO.Exception.B1Exception;
import com.avatech.edi.akcrm.B1JCO.B1Manager;
import com.avatech.edi.akcrm.model.bo.ResultData;
import com.avatech.edi.akcrm.service.PurchaseOrderService;
import com.avatech.edi.akcrm.repository.PurchaseOrderRepository;
import com.avatech.edi.akcrm.model.bo.purchaseorder.PurchaseOrder;
import com.avatech.edi.akcrm.tools.Tools;
import com.sap.smb.sbo.api.SBOCOMException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("v1/*")
public class PurchaseOrderController {

    private final Logger logger = LoggerFactory.getLogger(PurchaseOrderController.class);

    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;


    @GetMapping("purchaseorder")
    public @ResponseBody PurchaseOrder getPurchaseOrder(){
        PurchaseOrder purchaseOrder = purchaseOrderRepository.getRequestTemplate();
        purchaseOrder.setBdAddresses(purchaseOrderRepository.fetchBPAddressess(purchaseOrder.getCardCode()));
        return  purchaseOrder;
    }


    @PostMapping("purchaseorder")
    public @ResponseBody ResultData addPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder){
        String cardcode = "";
        try {
            logger.info("接收数据:"+Tools.serialization(purchaseOrder));
            cardcode = purchaseOrderService.operatitonB1Order(purchaseOrder);
        }catch (B1Exception ex){
            logger.error(ex.getMessage());
            return new ResultData("1001",ex.getMessage(),ex.toString());
        }catch (SBOCOMException ex){
            logger.error(ex.getMessage());
            return new ResultData("1001",ex.getMessage(),ex.toString());
        }catch (Exception ex){
            logger.error(ex.getMessage());
            return new ResultData("-1",ex.getMessage(),ex.toString());
        }
        return new ResultData("0","写入B1成功",cardcode);
    }

}