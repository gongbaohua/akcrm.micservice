/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-03
 */
package com.avatech.edi.akcrm.api;

import com.avatech.edi.akcrm.B1JCO.Exception.B1Exception;
import com.avatech.edi.akcrm.model.bo.ResultData;
import com.avatech.edi.akcrm.service.BusinessPartnerService;
import com.avatech.edi.akcrm.repository.PurchaseOrderRepository;
import com.avatech.edi.akcrm.model.bo.purchaseorder.BusinessPartner;
import com.avatech.edi.akcrm.service.SynB1Service;
import com.avatech.edi.akcrm.tools.Tools;
import com.sap.smb.sbo.api.SBOCOMException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("v1/*")
public class BusinessPartnerController {

    private final Logger logger = LoggerFactory.getLogger(BusinessPartnerController.class);

    @Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @Autowired
    private SynB1Service synB1Service;


    @GetMapping("purchaseorder")
    public @ResponseBody
    BusinessPartner getPurchaseOrder(){
        BusinessPartner purchaseOrder = purchaseOrderRepository.getRequestTemplate();
        purchaseOrder.setBdAddresses(purchaseOrderRepository.fetchBPAddressess(purchaseOrder.getCardCode()));
        return  purchaseOrder;
    }


    @PostMapping("purchaseorder")
    public @ResponseBody ResultData addPurchaseOrder(@RequestBody BusinessPartner businessPartner){
        String cardcode = "";
        try {
            logger.info("接收数据:"+Tools.serialization(businessPartner));
            cardcode = synB1Service.syncToB1(businessPartner);
        }catch (B1Exception ex){
            logger.error(ex.getMessage());
            return new ResultData("1001",ex.getMessage(),ex.toString());
        }catch (Exception e){
            logger.error(e.getMessage());
            return new ResultData("1001",e.getMessage(),e.toString());
        }
        return new ResultData("0","写入B1成功",cardcode);
    }

}