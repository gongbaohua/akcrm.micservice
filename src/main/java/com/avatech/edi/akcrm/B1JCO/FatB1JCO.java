package com.avatech.edi.akcrm.B1JCO;

import com.avatech.edi.akcrm.B1JCO.Exception.B1Exception;
import com.avatech.edi.akcrm.B1JCO.bean.B1Connection;
import com.avatech.edi.akcrm.model.bo.purchaseorder.PurchaseOrder;
import com.avatech.edi.akcrm.service.PurchaseOrderService;
import com.sap.smb.sbo.api.ICompany;
import com.sap.smb.sbo.api.SBOCOMException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public class FatB1JCO {
    public ICompany connectionB1(B1Connection b1Connection) throws B1Exception {
        ICompany company = null;
        BORepository boRepository = null;
        boRepository = BORepository.getInstance(b1Connection);
        company = boRepository.getCompany();
        return company;
    };
}
