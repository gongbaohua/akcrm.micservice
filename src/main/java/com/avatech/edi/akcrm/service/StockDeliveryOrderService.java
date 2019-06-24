package com.avatech.edi.akcrm.service;

import com.avatech.edi.akcrm.B1JCO.BORepository;
import com.avatech.edi.akcrm.B1JCO.Exception.B1Exception;
import com.avatech.edi.akcrm.B1JCO.bean.B1Connection;
import com.avatech.edi.akcrm.model.bo.deliveryorder.StockDeliveryItem;
import com.avatech.edi.akcrm.model.bo.deliveryorder.StockDeliveryOrder;
import com.avatech.edi.akcrm.tools.DocumentType;
import com.sap.smb.sbo.api.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class StockDeliveryOrderService {
    public String CreateStockDeliveryOrder(StockDeliveryOrder stockDeliveryOrder, B1Connection connection){
        BORepository boRepositoryBusinessOne = null;
        ICompany company = null;
      try {
          log.info(connection.toString());
          boRepositoryBusinessOne = BORepository.getInstance(connection);
          log.info("获取连接对象");
          company = boRepositoryBusinessOne.getCompany();
          //开启事务
          IDocuments documents = SBOCOMUtil.newDocuments(company, DocumentType.SALESORDER);
          documents.setDocDate(new Date());
          documents.setDocDueDate(new Date());
          documents.setTaxDate(new Date());
          for (StockDeliveryItem stockDeliveryItem :stockDeliveryOrder.getStockDeliveryItems()){
              documents.getLines().setQuantity(Double.valueOf(stockDeliveryItem.getQuantity().toString()));
              documents.getLines().setWarehouseCode(stockDeliveryItem.getWhsCode());
              documents.getLines().setPriceAfterVAT(Double.valueOf(stockDeliveryItem.getLineTotal().toString()));
          }
          if (!company.isInTransaction()) {
              company.startTransaction();
          }
          return null;
      }catch (SBOCOMException e){
          if(company.isInTransaction()){
              company.endTransaction(SBOCOMConstants.BoWfTransOpt_wf_RollBack);
          }
          log.error("",e);
          throw new B1Exception(e);
      }

    }
}
