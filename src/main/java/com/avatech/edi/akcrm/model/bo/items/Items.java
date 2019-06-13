/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-03
 */
package com.avatech.edi.akcrm.model.bo.items;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Items{


    /**
     * 物料编号
     */
    @JsonProperty(value = "ItemCode")
    private String itemCode;


    /**
     * 物料描述
     */
    @JsonProperty(value = "ItemName")
    private String itemName;


    /**
     * 全国经销商统一标准价格
     */
    @JsonProperty(value = "Price")
    private BigDecimal price;


    /**
     * 活跃
     */
    @JsonProperty(value = "validFor")
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
     * 预留
     */
    @JsonProperty(value = "QryGroup5")
    private String qryGroup5;


    /**
     * 预留
     */
    @JsonProperty(value = "QryGroup6")
    private String qryGroup6;


    /**
     * 物料组
     */
    @JsonProperty(value = "ItmsGrpCod")
    private String itmsGrpCod;


    /**
     * 物料类型
     */
    @JsonProperty(value = "ItemType")
    private String itemType;


    /**
     * 物料分类
     */
    @JsonProperty(value = "U_Field1")
    private String u_Field1;


    /**
     * 品类
     */
    @JsonProperty(value = "U_Field2")
    private String u_Field2;


    /**
     * 延保物料号
     */
    @JsonProperty(value = "U_Field3")
    private String u_Field3;


    /**
     * 开票显示名称
     */
    @JsonProperty(value = "U_Field4")
    private String u_Field4;


    /**
     * 产品系列
     */
    @JsonProperty(value = "U_profamily")
    private String u_profamily;


    /**
     * 产品线
     */
    @JsonProperty(value = "U_Proline")
    private String u_Proline;


    /**
     * 预留字段
     */
    @JsonProperty(value = "U_Field5")
    private String u_Field5;


    /**
     * 预留字段
     */
    @JsonProperty(value = "U_Field6")
    private String u_Field6;


    /**
     * 预留字段
     */
    @JsonProperty(value = "U_Field7")
    private String u_Field7;


    /**
     * 预留字段
     */
    @JsonProperty(value = "U_Field8")
    private String u_Field8;


    /**
     * 预留字段
     */
    @JsonProperty(value = "U_Field9")
    private String u_Field9;



    /**
     * 获取物料编号
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * 设置物料编号
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    /**
     * 获取物料描述
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 设置物料描述
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    /**
     * 获取全国经销商统一标准价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置全国经销商统一标准价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    /**
     * 获取活跃
     */
    public String getValidFor() {
        return validFor;
    }

    /**
     * 设置活跃
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
     * 获取预留
     */
    public String getQryGroup5() {
        return qryGroup5;
    }

    /**
     * 设置预留
     */
    public void setQryGroup5(String qryGroup5) {
        this.qryGroup5 = qryGroup5;
    }
    /**
     * 获取预留
     */
    public String getQryGroup6() {
        return qryGroup6;
    }

    /**
     * 设置预留
     */
    public void setQryGroup6(String qryGroup6) {
        this.qryGroup6 = qryGroup6;
    }
    /**
     * 获取物料组
     */
    public String getItmsGrpCod() {
        return itmsGrpCod;
    }

    /**
     * 设置物料组
     */
    public void setItmsGrpCod(String itmsGrpCod) {
        this.itmsGrpCod = itmsGrpCod;
    }
    /**
     * 获取物料类型
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * 设置物料类型
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    /**
     * 获取物料分类
     */
    public String getU_Field1() {
        return u_Field1;
    }

    /**
     * 设置物料分类
     */
    public void setU_Field1(String u_Field1) {
        this.u_Field1 = u_Field1;
    }
    /**
     * 获取品类
     */
    public String getU_Field2() {
        return u_Field2;
    }

    /**
     * 设置品类
     */
    public void setU_Field2(String u_Field2) {
        this.u_Field2 = u_Field2;
    }
    /**
     * 获取延保物料号
     */
    public String getU_Field3() {
        return u_Field3;
    }

    /**
     * 设置延保物料号
     */
    public void setU_Field3(String u_Field3) {
        this.u_Field3 = u_Field3;
    }
    /**
     * 获取开票显示名称
     */
    public String getU_Field4() {
        return u_Field4;
    }

    /**
     * 设置开票显示名称
     */
    public void setU_Field4(String u_Field4) {
        this.u_Field4 = u_Field4;
    }
    /**
     * 获取产品系列
     */
    public String getU_profamily() {
        return u_profamily;
    }

    /**
     * 设置产品系列
     */
    public void setU_profamily(String u_profamily) {
        this.u_profamily = u_profamily;
    }
    /**
     * 获取产品线
     */
    public String getU_Proline() {
        return u_Proline;
    }

    /**
     * 设置产品线
     */
    public void setU_Proline(String u_Proline) {
        this.u_Proline = u_Proline;
    }
    /**
     * 获取预留字段
     */
    public String getU_Field5() {
        return u_Field5;
    }

    /**
     * 设置预留字段
     */
    public void setU_Field5(String u_Field5) {
        this.u_Field5 = u_Field5;
    }
    /**
     * 获取预留字段
     */
    public String getU_Field6() {
        return u_Field6;
    }

    /**
     * 设置预留字段
     */
    public void setU_Field6(String u_Field6) {
        this.u_Field6 = u_Field6;
    }
    /**
     * 获取预留字段
     */
    public String getU_Field7() {
        return u_Field7;
    }

    /**
     * 设置预留字段
     */
    public void setU_Field7(String u_Field7) {
        this.u_Field7 = u_Field7;
    }
    /**
     * 获取预留字段
     */
    public String getU_Field8() {
        return u_Field8;
    }

    /**
     * 设置预留字段
     */
    public void setU_Field8(String u_Field8) {
        this.u_Field8 = u_Field8;
    }
    /**
     * 获取预留字段
     */
    public String getU_Field9() {
        return u_Field9;
    }

    /**
     * 设置预留字段
     */
    public void setU_Field9(String u_Field9) {
        this.u_Field9 = u_Field9;
    }
}
