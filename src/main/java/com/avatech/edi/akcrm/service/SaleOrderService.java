package com.avatech.edi.akcrm.service;

import com.avatech.edi.akcrm.B1JCO.B1Manager;
import com.avatech.edi.akcrm.B1JCO.BORepository;
import com.avatech.edi.akcrm.B1JCO.Exception.B1Exception;
import com.avatech.edi.akcrm.B1JCO.bean.B1Connection;
import com.avatech.edi.akcrm.model.bo.SaleOrder.SaleOrder;
import com.avatech.edi.akcrm.model.bo.SaleOrder.SalesOrderLine;
import com.avatech.edi.akcrm.tools.DocumentType;
import com.sap.smb.sbo.api.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;


@Slf4j
@Service
public class SaleOrderService {
    private final static String QUANTITY ="U_quanty";
    private final static String CRMNUM ="U_CRMnum";
    private final static String CRMMORDETYPE ="U_CRMordeType";
    private final static String ZBZK ="U_ZBZK";
    private final static String ZB1ZK ="U_ZB1ZK";
    private final static String ITEMENDPRICE ="U_ItemEndPrice";
    private final static String ITEMZKPRICE ="U_ItemEndPrice";
    private final static String NOTES ="U_Notes";
    private final static String DOCNUM = "U_DocNum";

    public String CreateSaleOrder(SaleOrder saleOrder,B1Connection connection){
        BORepository boRepositoryBusinessOne = null;
        ICompany company = null;
        try {
            IDocuments documents = SBOCOMUtil.newDocuments(company, DocumentType.SALESORDER);
            IRecordset recordset = SBOCOMUtil.newRecordset(company);
            documents.setDocDate(new Date());
            documents.setDocDueDate(new Date());
            documents.setTaxDate(new Date());
            for (SalesOrderLine salesOrderLine : saleOrder.getsalesOrderLines()){
                documents.getLines().setPriceAfterVAT(Double.valueOf(salesOrderLine.getItemEndPrice().toString()));
                documents.getLines().setWarehouseCode(salesOrderLine.getWhsCode());
                documents.getLines().setItemCode(salesOrderLine.getItemCode());
                documents.getLines().setQuantity(Double.valueOf(salesOrderLine.getQuantity().toString()));
            }

        }catch (Exception e){

        }

        return null;

    }
}
