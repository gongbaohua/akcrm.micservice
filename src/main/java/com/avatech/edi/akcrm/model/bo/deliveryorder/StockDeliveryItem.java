package com.avatech.edi.akcrm.model.bo.deliveryorder;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class StockDeliveryItem {

    /**
     * 申请单据编号
     */
    @JsonProperty(value = "crmdocEntry")
    private String crmdocEntry;


    /**
     * 工具名称
     */
    @JsonProperty(value = "name")
    private String name;


    /**
     * 类型
     */
    @JsonProperty(value = "docNum")
    private BigDecimal docNum;


    /**
     * 工具型号
     */
    @JsonProperty(value = "lineStatus")
    private String lineStatus;


    /**
     * 数量
     */
    @JsonProperty(value = "quantity")
    private BigDecimal quantity;


    /**
     * 折扣
     */
    @JsonProperty(value = "discPrcnt")
    private BigDecimal discPrcnt;


    /**
     * 行总计
     */
    @JsonProperty(value = "lineTotal")
    private BigDecimal lineTotal;


    /**
     * 物料编码
     */
    @JsonProperty(value = "itemCode")
    private String itemCode;


    /**
     * 仓库
     */
    @JsonProperty(value = "whsCode")
    private String whsCode;

    private Long docEntry;


    /**
     * 获取申请单据编号
     */
    public String getCrmdocEntry() {
        return crmdocEntry;
    }

    /**
     * 设置申请单据编号
     */
    public void setCrmdocEntry(String crmdocEntry) {
        this.crmdocEntry = crmdocEntry;
    }
    /**
     * 获取工具名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置工具名称
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 获取类型
     */

    /**
     * 获取工具型号
     */
    public String getLineStatus() {
        return lineStatus;
    }

    /**
     * 设置工具型号
     */
    public void setLineStatus(String lineStatus) {
        this.lineStatus = lineStatus;
    }
    /**
     * 获取数量
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * 设置数量
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    /**
     * 获取折扣
     */
    public BigDecimal getDiscPrcnt() {
        return discPrcnt;
    }

    /**
     * 设置折扣
     */
    public void setDiscPrcnt(BigDecimal discPrcnt) {
        this.discPrcnt = discPrcnt;
    }
    /**
     * 获取行总计
     */
    public BigDecimal getLineTotal() {
        return lineTotal;
    }

    /**
     * 设置行总计
     */
    public void setLineTotal(BigDecimal lineTotal) {
        this.lineTotal = lineTotal;
    }
    /**
     * 获取物料编码
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * 设置物料编码
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    /**
     * 获取基础单据行号
     */
    public BigDecimal getDocNum() {
        return docNum;
    }

    /**
     * 设置基础单据行号
     */
    public void setDocNum(BigDecimal docNum) {
        this.docNum = docNum;
    }
    /**
     * 获取仓库
     */
    public String getWhsCode() {
        return whsCode;
    }

    /**
     * 设置仓库
     */
    public void setWhsCode(String whsCode) {
        this.whsCode = whsCode;
    }

    public Long getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Long docEntry) {
        this.docEntry = docEntry;
    }
}
