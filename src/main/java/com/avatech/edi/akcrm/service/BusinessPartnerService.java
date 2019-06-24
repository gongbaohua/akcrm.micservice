package com.avatech.edi.akcrm.service;

import com.avatech.edi.akcrm.B1JCO.BORepository;
import com.avatech.edi.akcrm.B1JCO.FatB1JCO;
import com.avatech.edi.akcrm.B1JCO.B1Manager;
import com.avatech.edi.akcrm.B1JCO.Exception.B1Exception;
import com.avatech.edi.akcrm.B1JCO.bean.B1Connection;
import com.avatech.edi.akcrm.model.bo.purchaseorder.BPAddresses;
import com.avatech.edi.akcrm.model.bo.purchaseorder.BusinessPartner;
import com.sap.smb.sbo.api.*;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
public class BusinessPartnerService extends FatB1JCO {

    private final Logger logger = LoggerFactory.getLogger(BusinessPartnerService.class);

    public String operatitonB1Order(BusinessPartner businessPartner,B1Connection connection)  {
        BORepository boRepositoryBusinessOne = null;
        ICompany company = null;
        log.info(connection.toString());
        boRepositoryBusinessOne = BORepository.getInstance(connection);
        log.info("获取连接对象");
        company = boRepositoryBusinessOne.getCompany();
        String resultStr = "";
            IBusinessPartners businessPartners = null;
            Boolean isExist ;
            try{
                businessPartners = SBOCOMUtil.newBusinessPartners(company);

                if(businessPartners.getByKey(businessPartner.getCardCode())){
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
                businessPartners.setCardCode(businessPartner.getCardCode());
                businessPartners.setCardName(businessPartner.getCardName());
                businessPartners.setCardType(getTypeValue(businessPartner.getCardType()));
                businessPartners.setGroupCode(Integer.parseInt(businessPartner.getGroupCode()));
                businessPartners.getUserFields().getFields().item("U_BLD").setValue(businessPartner.getU_BLD());
                businessPartners.setCompanyPrivate(businessPartner.getValidFor().trim().equals("Y")?SBOCOMConstants.BoYesNoEnum_tYES:SBOCOMConstants.BoYesNoEnum_tNO);
                //QryGroup1
//              businessPartners.set(purchaseOrder.getValidFor().trim().equals("Y")?SBOCOMConstants.BoYesNoEnum_tYES:SBOCOMConstants.BoYesNoEnum_tNO);
                businessPartners.getUserFields().getFields().item("U_Field1").setValue(businessPartner.getU_Field1());
                businessPartners.getUserFields().getFields().item("U_Field2").setValue(businessPartner.getU_Field2());
                businessPartners.getUserFields().getFields().item("U_Field3").setValue(businessPartner.getU_Field3());
                businessPartners.getUserFields().getFields().item("U_BUOP").setValue(businessPartner.getU_BUOP());
//                businessPartners.setSalesPersonCode(Integer.parseInt(purchaseOrder.getSlpcode()));
                businessPartners.setGTSRegNo(businessPartner.getgTSRegNum());
                businessPartners.setGTSBankAccountNo(businessPartner.getgTSBankAct());
                businessPartners.setGTSBillingAddrTel(businessPartner.getgTSBilAddr());
                businessPartners.getUserFields().getFields().item("U_ProLicense").setValue(businessPartner.getU_ProLicense());
                businessPartners.getUserFields().getFields().item("U_Licedate").setValue(businessPartner.getU_Licedate());
                businessPartners.setPhone1(businessPartner.getPhone1());
                businessPartners.setPhone2(businessPartner.getPhone2());
                businessPartners.setCellular(businessPartner.getCellular());
                for (BPAddresses addres:businessPartner.getBdAddresses()) {
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
                    logger.info("生成成功");
                }else {
                    throw new B1Exception(company.getLastErrorCode() + ":" + company.getLastErrorDescription());
                }
            }catch (SBOCOMException ex){

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