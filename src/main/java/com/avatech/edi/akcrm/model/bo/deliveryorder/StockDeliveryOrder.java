package com.avatech.edi.akcrm.model.bo.deliveryorder;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class StockDeliveryOrder {

    /**
     * 供应商编码
     */
    @JsonProperty(value = "cardCode")
    private String cardCode;


    /**
     * crm单号
     */
    @JsonProperty(value = "docNum")
    private String docNum;


    /**
     * 申请时间
     */
    @JsonProperty(value = "greateDate")
    private String greateDate;


    /**
     * 备注
     */
    @JsonProperty(value = "comments")
    private String comments;


    /**
     * 类型
     */
    @JsonProperty(value = "type")
    private String type;


    /**
     * 单据状态
     */
    @JsonProperty(value = "docStatus")
    private String docStatus;

    private Long docEntry;

    private String isSync;

    private String isReturn;


    private List<StockDeliveryItem> stockDeliveryItems;


    /**
     * 获取供应商编码
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * 设置供应商编码
     */
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }
    /**
     * 获取crm单号
     */
    public String getDocNum() {
        return docNum;
    }

    /**
     * 设置crm单号
     */
    public void setDocNum(String docNum) {
        this.docNum = docNum;
    }
    /**
     * 获取申请时间
     */
    public String getGreateDate() {
        return greateDate;
    }

    /**
     * 设置申请时间
     */
    public void setGreateDate(String greateDate) {
        this.greateDate = greateDate;
    }
    /**
     * 获取备注
     */
    public String getComments() {
        return comments;
    }

    /**
     * 设置备注
     */
    public void setComments(String comments) {
        this.comments = comments;
    }
    /**
     * 获取类型
     */
    public String getType() {
        return type;
    }


    /**
     * 设置类型
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * 获取单据状态
     */
    public String getDocStatus() {
        return docStatus;
    }

    public Long getDocEntry() {
        return docEntry;
    }

    public void setDocEntry(Long docEntry) {
        this.docEntry = docEntry;
    }

    public String getIsSync() {
        return isSync;
    }

    public void setIsSync(String isSync) {
        this.isSync = isSync;
    }

    public String getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(String isReturn) {
        this.isReturn = isReturn;
    }


    /**
     * 设置单据状态
     */

    public void setDocStatus(String docStatus) {
        this.docStatus = docStatus;
    }

    public List<StockDeliveryItem> getStockDeliveryItems() {
        if(stockDeliveryItems == null){
            stockDeliveryItems = new ArrayList<>();
        }
        return stockDeliveryItems;
    }

    public void setStockDeliveryItems(List<StockDeliveryItem> stockDeliveryItems) {
        this.stockDeliveryItems = stockDeliveryItems;
    }
}
