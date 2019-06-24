/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-03
 */
package com.avatech.edi.akcrm.mapper;


import com.avatech.edi.akcrm.model.bo.purchaseorder.BusinessPartner;
import com.avatech.edi.akcrm.model.bo.purchaseorder.BPAddresses;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface PurchaseOrderMapper{

    void insertPurchaseOrder(BusinessPartner PurchaseOrder);

    List<BusinessPartner> searchPurchaseOrder();

    void insertBPAddresses(BPAddresses BPAddresses);

    List<BPAddresses> searchBPAddresses(@Param("CardCode")String CardCode);

    BusinessPartner searchRequestTemplate();
}