/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-03
 */
package com.avatech.edi.akcrm.repository;

import com.avatech.edi.akcrm.model.bo.purchaseorder.PurchaseOrder;
import com.avatech.edi.akcrm.model.bo.purchaseorder.BPAddresses;
import org.springframework.stereotype.Component;
import java.util.List;

public interface PurchaseOrderRepository{

    void savePurchaseOrder(PurchaseOrder PurchaseOrder);

    List<PurchaseOrder> fetchPurchaseOrders();

    void saveBPAddresses(BPAddresses BPAddresses);

    List<BPAddresses> fetchBPAddressess(String CardCode);

    PurchaseOrder getRequestTemplate();
}