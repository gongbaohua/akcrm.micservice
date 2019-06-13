/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-03
 */
package com.avatech.edi.akcrm.model.bo.purchaseorder;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class PurchaseOrder{


    /**
     * 业务伙伴代码
     */
    @JsonProperty(value = "CardCode")
    private String cardCode;


    /**
     * 业务伙伴类型
     */
    @JsonProperty(value = "CardType")
    private String cardType;


    /**
     * 业务伙伴名称
     */
    @JsonProperty(value = "CardName")
    private String cardName;


    /**
     * 客户组
     */
    @JsonProperty(value = "GroupCode")
    private String groupCode;


    /**
     * 签约公司代码
     */
    @JsonProperty(value = "U_BLD")
    private String u_BLD;


    /**
     * 可用
     */
    @JsonProperty(value = "ValidFor")
    private String validFor;


    /**
     * III-6846植入材料人工器官
     */
    @JsonProperty(value = "QryGroup1")
    private String qryGroup1;


    /**
     * III-6865医用缝合材料及粘合剂
     */
    @JsonProperty(value = "QryGroup2")
    private String qryGroup2;


    /**
     * II-6854冲洗、通气、减压器具
     */
    @JsonProperty(value = "QryGroup3")
    private String qryGroup3;


    /**
     * II-6810矫形外科（骨科）手术器械
     */
    @JsonProperty(value = "QryGroup4")
    private String qryGroup4;


    /**
     * 预留属性5
     */
    @JsonProperty(value = "QryGroup5")
    private String qryGroup5;


    /**
     * 预留属性6
     */
    @JsonProperty(value = "QryGroup6")
    private String qryGroup6;


    /**
     * 预留字段1
     */
    @JsonProperty(value = "U_Field1")
    private String u_Field1;


    /**
     * 预留字段2
     */
    @JsonProperty(value = "U_Field2")
    private String u_Field2;


    /**
     * 预留字段3
     */
    @JsonProperty(value = "U_Field3")
    private String u_Field3;


    /**
     * 业务省区
     */
    @JsonProperty(value = "U_BUOP")
    private String u_BUOP;


    /**
     * 业务员
     */
    @JsonProperty(value = "slpcode")
    private String slpcode;


    /**
     * 金税注册号
     */
    @JsonProperty(value = "GTSRegNum")
    private String gTSRegNum;


    /**
     * 金税开户行及账号
     */
    @JsonProperty(value = "GTSBankAct")
    private String gTSBankAct;


    /**
     * 金税开票地址及电话
     */
    @JsonProperty(value = "GTSBilAddr")
    private String gTSBilAddr;


    /**
     * 电话1
     */
    @JsonProperty(value = "Phone1")
    private String phone1;


    /**
     * 电话2
     */
    @JsonProperty(value = "Phone2")
    private String phone2;


    /**
     * 移动电话
     */
    @JsonProperty(value = "Cellular")
    private String cellular;


    /**
     * 客户许可证编号
     */
    @JsonProperty(value = "U_ProLicense")
    private String u_ProLicense;


    /**
     * 资质有效期
     */
    @JsonProperty(value = "U_Licedate")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date u_Licedate;


    @JsonProperty(value = "BDAddresses")
    private List<BPAddresses> bdAddresses;

    public String getgTSRegNum() {
        return gTSRegNum;
    }

    public void setgTSRegNum(String gTSRegNum) {
        this.gTSRegNum = gTSRegNum;
    }

    public String getgTSBankAct() {
        return gTSBankAct;
    }

    public void setgTSBankAct(String gTSBankAct) {
        this.gTSBankAct = gTSBankAct;
    }

    public String getgTSBilAddr() {
        return gTSBilAddr;
    }

    public void setgTSBilAddr(String gTSBilAddr) {
        this.gTSBilAddr = gTSBilAddr;
    }

    public List<BPAddresses> getBdAddresses() {
        return bdAddresses;
    }

    public void setBdAddresses(List<BPAddresses> bdAddresses) {
        this.bdAddresses = bdAddresses;
    }

    /**
     * 获取业务伙伴代码
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * 设置业务伙伴代码
     */
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }
    /**
     * 获取业务伙伴类型
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * 设置业务伙伴类型
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    /**
     * 获取业务伙伴名称
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * 设置业务伙伴名称
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
    /**
     * 获取客户组
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * 设置客户组
     */
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
    /**
     * 获取签约公司代码
     */
    public String getU_BLD() {
        return u_BLD;
    }

    /**
     * 设置签约公司代码
     */
    public void setU_BLD(String u_BLD) {
        this.u_BLD = u_BLD;
    }
    /**
     * 获取可用
     */
    public String getValidFor() {
        return validFor;
    }

    /**
     * 设置可用
     */
    public void setValidFor(String validFor) {
        this.validFor = validFor;
    }
    /**
     * 获取III-6846植入材料人工器官
     */
    public String getQryGroup1() {
        return qryGroup1;
    }

    /**
     * 设置III-6846植入材料人工器官
     */
    public void setQryGroup1(String qryGroup1) {
        this.qryGroup1 = qryGroup1;
    }
    /**
     * 获取III-6865医用缝合材料及粘合剂
     */
    public String getQryGroup2() {
        return qryGroup2;
    }

    /**
     * 设置III-6865医用缝合材料及粘合剂
     */
    public void setQryGroup2(String qryGroup2) {
        this.qryGroup2 = qryGroup2;
    }
    /**
     * 获取II-6854冲洗、通气、减压器具
     */
    public String getQryGroup3() {
        return qryGroup3;
    }

    /**
     * 设置II-6854冲洗、通气、减压器具
     */
    public void setQryGroup3(String qryGroup3) {
        this.qryGroup3 = qryGroup3;
    }
    /**
     * 获取II-6810矫形外科（骨科）手术器械
     */
    public String getQryGroup4() {
        return qryGroup4;
    }

    /**
     * 设置II-6810矫形外科（骨科）手术器械
     */
    public void setQryGroup4(String qryGroup4) {
        this.qryGroup4 = qryGroup4;
    }
    /**
     * 获取预留属性5
     */
    public String getQryGroup5() {
        return qryGroup5;
    }

    /**
     * 设置预留属性5
     */
    public void setQryGroup5(String qryGroup5) {
        this.qryGroup5 = qryGroup5;
    }
    /**
     * 获取预留属性6
     */
    public String getQryGroup6() {
        return qryGroup6;
    }

    /**
     * 设置预留属性6
     */
    public void setQryGroup6(String qryGroup6) {
        this.qryGroup6 = qryGroup6;
    }
    /**
     * 获取预留字段1
     */
    public String getU_Field1() {
        return u_Field1;
    }

    /**
     * 设置预留字段1
     */
    public void setU_Field1(String u_Field1) {
        this.u_Field1 = u_Field1;
    }
    /**
     * 获取预留字段2
     */
    public String getU_Field2() {
        return u_Field2;
    }

    /**
     * 设置预留字段2
     */
    public void setU_Field2(String u_Field2) {
        this.u_Field2 = u_Field2;
    }
    /**
     * 获取预留字段3
     */
    public String getU_Field3() {
        return u_Field3;
    }

    /**
     * 设置预留字段3
     */
    public void setU_Field3(String u_Field3) {
        this.u_Field3 = u_Field3;
    }
    /**
     * 获取业务省区
     */
    public String getU_BUOP() {
        return u_BUOP;
    }

    /**
     * 设置业务省区
     */
    public void setU_BUOP(String u_BUOP) {
        this.u_BUOP = u_BUOP;
    }
    /**
     * 获取业务员
     */
    public String getSlpcode() {
        return slpcode;
    }

    /**
     * 设置业务员
     */
    public void setSlpcode(String slpcode) {
        this.slpcode = slpcode;
    }

    /**
     * 获取电话1
     */
    public String getPhone1() {
        return phone1;
    }

    /**
     * 设置电话1
     */
    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }
    /**
     * 获取电话2
     */
    public String getPhone2() {
        return phone2;
    }

    /**
     * 设置电话2
     */
    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }
    /**
     * 获取移动电话
     */
    public String getCellular() {
        return cellular;
    }

    /**
     * 设置移动电话
     */
    public void setCellular(String cellular) {
        this.cellular = cellular;
    }
    /**
     * 获取客户许可证编号
     */
    public String getU_ProLicense() {
        return u_ProLicense;
    }

    /**
     * 设置客户许可证编号
     */
    public void setU_ProLicense(String u_ProLicense) {
        this.u_ProLicense = u_ProLicense;
    }
    /**
     * 获取资质有效期
     */
    public Date getU_Licedate() {
        return u_Licedate;
    }

    /**
     * 设置资质有效期
     */
    public void setU_Licedate(Date u_Licedate) {
        this.u_Licedate = u_Licedate;
    }
}