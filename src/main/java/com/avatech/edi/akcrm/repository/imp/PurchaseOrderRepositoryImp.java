/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-03
 */
package com.avatech.edi.akcrm.repository.imp;

import com.avatech.edi.akcrm.model.bo.purchaseorder.BusinessPartner;
import com.avatech.edi.akcrm.model.bo.purchaseorder.BPAddresses;
import com.avatech.edi.akcrm.mapper.PurchaseOrderMapper;
import com.avatech.edi.akcrm.repository.PurchaseOrderRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;

@Component
public class PurchaseOrderRepositoryImp implements PurchaseOrderRepository{
    @Autowired
    private PurchaseOrderMapper purchaseOrderMapper;


    public void savePurchaseOrder(BusinessPartner purchaseOrder){
        purchaseOrderMapper.insertPurchaseOrder(purchaseOrder);

    }

    public List<BusinessPartner> fetchPurchaseOrders(){
        List<BusinessPartner> purchaseOrders = new ArrayList();
        purchaseOrders = purchaseOrderMapper.searchPurchaseOrder();
        return purchaseOrders;
    }

    public void saveBPAddresses(BPAddresses bPAddresses){
        purchaseOrderMapper.insertBPAddresses(bPAddresses);

    }

    public List<BPAddresses> fetchBPAddressess(String CardCode){
        List<BPAddresses> bPAddressess = new ArrayList();
        bPAddressess = purchaseOrderMapper.searchBPAddresses(CardCode);
        return bPAddressess;
    }

    public BusinessPartner getRequestTemplate(){

        return purchaseOrderMapper.searchRequestTemplate();
    }
}