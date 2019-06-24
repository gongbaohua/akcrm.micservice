package com.avatech.edi.akcrm.model.bo.SaleOrder;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class SalesOrderLine {

    /**
     * 编码
     */
    @JsonProperty(value = "quantity")
    private BigDecimal quantity;


    /**
     * 行号
     */
    @JsonProperty(value = "lineNum")
    private String lineNum;


    /**
     * 类型
     */
    @JsonProperty(value = "zblzk")
    private String zblzk;


    /**
     * 单据状态
     */
    @JsonProperty(value = "lineStatus")
    private String lineStatus;


    /**
     * 参考1
     */
    @JsonProperty(value = "itemEndPrice")
    private BigDecimal itemEndPrice;


    /**
     * 参考2
     */
    @JsonProperty(value = "itemZKPrice")
    private BigDecimal itemZKPrice;


    /**
     * 基础单据类型
     */
    @JsonProperty(value = "itemCode")
    private String itemCode;


    /**
     * 基础单据编号
     */
    @JsonProperty(value = "notes")
    private String notes;


    /**
     * 基础单据行号
     */
    @JsonProperty(value = "docNum")
    private String docNum;


    /**
     * 项目代码
     */
    @JsonProperty(value = "sjSalesNum")
    private String sjSalesNum;


    /**
     * 仓库
     */
    @JsonProperty(value = "whsCode")
    private String whsCode;


    private BigDecimal price;

    private Long docEntry;

    /**
     * 获取编码
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * 设置编码
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    /**
     * 获取行号
     */
    public String getLineNum() {
        return lineNum;
    }

    /**
     * 设置行号
     */
    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }
    /**
     * 获取类型
     */
    public String getZblzk() {
        return zblzk;
    }

    /**
     * 设置类型
     */
    public void setZblzk(String zblzk) {
        this.zblzk = zblzk;
    }
    /**
     * 获取单据状态
     */
    public String getLineStatus() {
        return lineStatus;
    }

    /**
     * 设置单据状态
     */
    public void setLineStatus(String lineStatus) {
        this.lineStatus = lineStatus;
    }
    /**
     * 获取参考1
     */
    public BigDecimal getItemEndPrice() {
        return itemEndPrice;
    }

    /**
     * 设置参考1
     */
    public void setItemEndPrice(BigDecimal itemEndPrice) {
        this.itemEndPrice = itemEndPrice;
    }
    /**
     * 获取参考2
     */
    public BigDecimal getItemZKPrice() {
        return itemZKPrice;
    }

    /**
     * 设置参考2
     */
    public void setItemZKPrice(BigDecimal itemZKPrice) {
        this.itemZKPrice = itemZKPrice;
    }
    /**
     * 获取基础单据类型
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * 设置基础单据类型
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    /**
     * 获取基础单据编号
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置基础单据编号
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
    /**
     * 获取基础单据行号
     */
    public String getDocNum() {
        return docNum;
    }

    /**
     * 设置基础单据行号
     */
    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }
    /**
     * 获取项目代码
     */
    public String getSjSalesNum() {
        return sjSalesNum;
    }

    /**
     * 设置项目代码
     */
    public void setSjSalesNum(String sjSalesNum) {
        this.sjSalesNum = sjSalesNum;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Long docEntry) {
        this.docEntry = docEntry;
    }
}
