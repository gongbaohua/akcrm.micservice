package com.avatech.edi.akcrm.service;

import com.avatech.edi.akcrm.B1JCO.FatB1JCO;
import com.avatech.edi.akcrm.B1JCO.B1Manager;
import com.avatech.edi.akcrm.B1JCO.Exception.B1Exception;
import com.avatech.edi.akcrm.B1JCO.bean.B1Connection;
import com.avatech.edi.akcrm.model.bo.purchaseorder.BPAddresses;
import com.avatech.edi.akcrm.model.bo.purchaseorder.PurchaseOrder;
import com.sap.smb.sbo.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class PurchaseOrderService extends FatB1JCO {

    private final Logger logger = LoggerFactory.getLogger(PurchaseOrderService.class);

    public String operatitonB1Order(PurchaseOrder purchaseOrder) throws B1Exception, IOException,SBOCOMException {
        ICompany company = null;
        List<B1Connection> b1Connection = B1Manager.getConfigInfo();
        String resultStr = "";
        for (B1Connection b1Con:b1Connection ) {
            company = super.connectionB1(b1Con);
            IBusinessPartners businessPartners = null;
            Boolean isExist ;
            try{
                businessPartners = SBOCOMUtil.newBusinessPartners(company);

                if(businessPartners.getByKey(purchaseOrder.getCardCode())){
                    isExist = true;
                    //如果存在就先删除收货方
                    for(int i=businessPartners.getAddresses().getCount()-1;i>=0;i--){
                        if(businessPartners.getAddresses().getAddressType() == SBOCOMConstants.BoAddressType_bo_ShipTo){
                            businessPartners.getAddresses().setCurrentLine(i);
                            businessPartners.getAddresses().delete();
                        }
                    }
                }else {
                    isExist = false;
                }
                businessPartners.setCardCode(purchaseOrder.getCardCode());
                businessPartners.setCardName(purchaseOrder.getCardName());
                businessPartners.setCardType(getTypeValue(purchaseOrder.getCardType()));
                businessPartners.setGroupCode(Integer.parseInt(purchaseOrder.getGroupCode()));
                businessPartners.getUserFields().getFields().item("U_BLD").setValue(purchaseOrder.getU_BLD());
                businessPartners.setCompanyPrivate(purchaseOrder.getValidFor().trim().equals("Y")?SBOCOMConstants.BoYesNoEnum_tYES:SBOCOMConstants.BoYesNoEnum_tNO);
                //QryGroup1
//              businessPartners.set(purchaseOrder.getValidFor().trim().equals("Y")?SBOCOMConstants.BoYesNoEnum_tYES:SBOCOMConstants.BoYesNoEnum_tNO);
                businessPartners.getUserFields().getFields().item("U_Field1").setValue(purchaseOrder.getU_Field1());
                businessPartners.getUserFields().getFields().item("U_Field2").setValue(purchaseOrder.getU_Field2());
                businessPartners.getUserFields().getFields().item("U_Field3").setValue(purchaseOrder.getU_Field3());
                businessPartners.getUserFields().getFields().item("U_BUOP").setValue(purchaseOrder.getU_BUOP());
//                businessPartners.setSalesPersonCode(Integer.parseInt(purchaseOrder.getSlpcode()));
                businessPartners.setGTSRegNo(purchaseOrder.getgTSRegNum());
                businessPartners.setGTSBankAccountNo(purchaseOrder.getgTSBankAct());
                businessPartners.setGTSBillingAddrTel(purchaseOrder.getgTSBilAddr());
                businessPartners.getUserFields().getFields().item("U_ProLicense").setValue(purchaseOrder.getU_ProLicense());
                businessPartners.getUserFields().getFields().item("U_Licedate").setValue(purchaseOrder.getU_Licedate());
                businessPartners.setPhone1(purchaseOrder.getPhone1());
                businessPartners.setPhone2(purchaseOrder.getPhone2());
                businessPartners.setCellular(purchaseOrder.getCellular());
                for (BPAddresses addres:purchaseOrder.getBdAddresses()) {
                    businessPartners.getAddresses().setAddressName(addres.getAddress());
                    businessPartners.getAddresses().setStreet(addres.getStreet());
                    businessPartners.getAddresses().setAddressType(SBOCOMConstants.BoAddressType_bo_ShipTo);
                    businessPartners.getAddresses().add();
                }
                int rstCode;
                if(isExist){
                    rstCode = businessPartners.update();
                }else{
                    rstCode = businessPartners.add();
                }
                if(rstCode == 0){
                    resultStr += b1Con.getCompanyDB() + ":" + purchaseOrder.getCardCode() + "；写入B1成功\r\n";
                }else {
                    throw new B1Exception(company.getLastErrorCode() + ":" + company.getLastErrorDescription());
                }
            }catch (SBOCOMException ex){
                throw new SBOCOMException(b1Con.getCompanyDB() + "" + ex.getMessage());
            }
        }
        return  resultStr;
    }
    private Integer getTypeValue(String typeName){
        switch (typeName){
            case "C":return SBOCOMConstants.BoCardTypes_cCustomer;
            case "S":return SBOCOMConstants.BoCardTypes_cSupplier;
            case "L":return SBOCOMConstants.BoCardTypes_cLid;
            default:throw new B1Exception("CardType:"+typeName+"  类型为空或不匹配");
        }
    }
}