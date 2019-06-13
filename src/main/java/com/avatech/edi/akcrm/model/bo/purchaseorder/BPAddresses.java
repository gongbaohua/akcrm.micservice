/**
 * PLEASE KEEP THIS INFOMATION
 * CREATE BY AVATECH EDI CODE TOOL
 * AT 2019-06-03
 */
package com.avatech.edi.akcrm.model.bo.purchaseorder;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class BPAddresses{


    /**
     * 姓名
     */
    @JsonProperty(value = "CardCode")
    private String cardCode;


    /**
     * 地址标识
     */
    @JsonProperty(value = "Address")
    private String address;


    /**
     * 街道/邮箱
     */
    @JsonProperty(value = "street")
    private String street;

    /**
     * 获取姓名
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * 设置姓名
     */
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }
    /**
     * 获取地址标识
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址标识
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * 获取街道/邮箱
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置街道/邮箱
     */
    public void setStreet(String street) {
        this.street = street;
    }

}