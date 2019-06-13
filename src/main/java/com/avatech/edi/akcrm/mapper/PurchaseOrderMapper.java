/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-03
 */
package com.avatech.edi.akcrm.mapper;


import com.avatech.edi.akcrm.model.bo.purchaseorder.PurchaseOrder;
import com.avatech.edi.akcrm.model.bo.purchaseorder.BPAddresses;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface PurchaseOrderMapper{

    void insertPurchaseOrder(PurchaseOrder PurchaseOrder);

    List<PurchaseOrder> searchPurchaseOrder();

    void insertBPAddresses(BPAddresses BPAddresses);

    List<BPAddresses> searchBPAddresses(@Param("CardCode")String CardCode);

    PurchaseOrder searchRequestTemplate();
}