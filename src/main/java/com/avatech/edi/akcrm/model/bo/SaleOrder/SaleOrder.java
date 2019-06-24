package com.avatech.edi.akcrm.model.bo.SaleOrder;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SaleOrder {

    /**
     * 数量合计
     */
    @JsonProperty(value = "quantity")
    private BigDecimal quantity;


    /**
     * CRM单据号
     */
    @JsonProperty(value = "crmNum")
    private String crmNum;


    /**
     * CRM单据类型
     */
    @JsonProperty(value = "crmOrderType")
    private String crmOrderType;


    /**
     * [客服]整单折扣率
     */
    @JsonProperty(value = "zbzk")
    private BigDecimal zbzk;


    /**
     * 类型
     */
    @JsonProperty(value = "jdzz")
    private String jdzz;


    /**
     * 备注
     */
    @JsonProperty(value = "comments")
    private String comments;


    /**
     * 顺丰收货地址
     */
    @JsonProperty(value = "zbzzk")
    private String zbzzk;


    /**
     * 业务伙伴编码
     */
    @JsonProperty(value = "cradNo")
    private String cradNo;


    /**
     * 修改日期
     */
    @JsonProperty(value = "Rebate")
    private BigDecimal rebate;


    /**
     * 修改时间
     */
    @JsonProperty(value = "dbbPrice")
    private BigDecimal dbbPrice;


    /**
     * 创建用户
     */
    @JsonProperty(value = "zdprice")
    private BigDecimal zdprice;


    /**
     * 修改用户
     */
    @JsonProperty(value = "payDemo")
    private String payDemo;


    /**
     * 单据状态
     */
    @JsonProperty(value = "buyPerson")
    private String buyPerson;


    /**
     * 过账日期
     */
    @JsonProperty(value = "payPerson")
    private String payPerson;


    /**
     * 到期日
     */
    @JsonProperty(value = "billType")
    private String billType;


    /**
     * 凭证日期
     */
    @JsonProperty(value = "invPrice")
    private String invPrice;


    /**
     * 参考1
     */
    @JsonProperty(value = "endAddName")
    private String endAddName;


    /**
     * 参考2
     */
    @JsonProperty(value = "endAddress")
    private String endAddress;


    /**
     * 备注
     */
    @JsonProperty(value = "cont")
    private String cont;


    /**
     * B1凭证编号
     */
    @JsonProperty(value = "phone")
    private String phone;


    /**
     * BYD唯一标号
     */
    @JsonProperty(value = "isYbnsr")
    private String isYbnsr;


    /**
     * 自定义类型
     */
    @JsonProperty(value = "gTSBank")
    private String gTSBank;


    /**
     * 业务伙伴编码
     */
    @JsonProperty(value = "gtsBact")
    private String gtsBact;


    /**
     * 业务伙伴名称
     */
    @JsonProperty(value = "gtsbAddr")
    private String gtsbAddr;


    /**
     * 目标单据类型
     */
    @JsonProperty(value = "salePerson")
    private String salePerson;


    /**
     * 基础单据类型
     */

    /**
     * 基础单据编号
     */
    @JsonProperty(value = "zbfl")
    private String zbfl;


    /**
     * 汇报人
     */
    @JsonProperty(value = "buyCard")
    private String buyCard;


    private String orderNo;

    private String  createTime;

    private String createDate;

    private Long docEntry;

    private String isSync;

    private String isReturn;


    private List<SalesOrderLine> salesOrderLines;


    /**
     * 获取数量合计
     */
    public BigDecimal getQuantity() {
        return quantity;
    }

    /**
     * 设置数量合计
     */
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }
    /**
     * 获取CRM单据号
     */
    public String getCrmNum() {
        return crmNum;
    }

    /**
     * 设置CRM单据号
     */
    public void setCrmNum(String crmNum) {
        this.crmNum = crmNum;
    }
    /**
     * 获取CRM单据类型
     */
    public String getCrmOrderType() {
        return crmOrderType;
    }

    /**
     * 设置CRM单据类型
     */
    public void setCrmOrderType(String crmOrderType) {
        this.crmOrderType = crmOrderType;
    }
    /**
     * 获取[客服]整单折扣率
     */
    public BigDecimal getZbzk() {
        return zbzk;
    }

    /**
     * 设置[客服]整单折扣率
     */
    public void setZbzk(BigDecimal zbzk) {
        this.zbzk = zbzk;
    }
    /**
     * 获取类型
     */
    public String getJdzz() {
        return jdzz;
    }

    /**
     * 设置类型
     */
    public void setJdzz(String jdzz) {
        this.jdzz = jdzz;
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
     * 获取顺丰收货地址
     */
    /**
     * 获取业务伙伴编码
     */
    public String getCradNo() {
        return cradNo;
    }

    /**
     * 设置业务伙伴编码
     */
    public void setCradNo(String cradNo) {
        this.cradNo = cradNo;
    }
    /**
     * 获取修改日期
     */
    public BigDecimal getRebate() {
        return rebate;
    }

    /**
     * 设置修改日期
     */
    public void setRebate(BigDecimal rebate) {
        this.rebate = rebate;
    }
    /**
     * 获取修改时间
     */
    public BigDecimal getDbbPrice() {
        return dbbPrice;
    }

    /**
     * 设置修改时间
     */
    public void setDbbPrice(BigDecimal dbbPrice) {
        this.dbbPrice = dbbPrice;
    }
    /**
     * 获取创建用户
     */
    public BigDecimal getZdprice() {
        return zdprice;
    }

    /**
     * 设置创建用户
     */
    public void setZdprice(BigDecimal zdprice) {
        this.zdprice = zdprice;
    }
    /**
     * 获取修改用户
     */
    public String getPayDemo() {
        return payDemo;
    }

    /**
     * 设置修改用户
     */
    public void setPayDemo(String payDemo) {
        this.payDemo = payDemo;
    }
    /**
     * 获取单据状态
     */
    public String getBuyPerson() {
        return buyPerson;
    }

    /**
     * 设置单据状态
     */
    public void setBuyPerson(String buyPerson) {
        this.buyPerson = buyPerson;
    }
    /**
     * 获取过账日期
     */
    public String getPayPerson() {
        return payPerson;
    }

    /**
     * 设置过账日期
     */
    public void setPayPerson(String payPerson) {
        this.payPerson = payPerson;
    }
    /**
     * 获取到期日
     */
    public String getBillType() {
        return billType;
    }

    /**
     * 设置到期日
     */
    public void setBillType(String billType) {
        this.billType = billType;
    }
    /**
     * 获取凭证日期
     */
    public String getInvPrice() {
        return invPrice;
    }

    /**
     * 设置凭证日期
     */
    public void setInvPrice(String invPrice) {
        this.invPrice = invPrice;
    }
    /**
     * 获取参考1
     */
    public String getEndAddName() {
        return endAddName;
    }

    /**
     * 设置参考1
     */
    public void setEndAddName(String endAddName) {
        this.endAddName = endAddName;
    }
    /**
     * 获取参考2
     */
    public String getEndAddress() {
        return endAddress;
    }

    /**
     * 设置参考2
     */
    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }
    /**
     * 获取备注
     */
    public String getCont() {
        return cont;
    }

    /**
     * 设置备注
     */
    public void setCont(String cont) {
        this.cont = cont;
    }
    /**
     * 获取B1凭证编号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置B1凭证编号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    /**
     * 获取BYD唯一标号
     */
    public String getIsYbnsr() {
        return isYbnsr;
    }

    /**
     * 设置BYD唯一标号
     */
    public void setIsYbnsr(String isYbnsr) {
        this.isYbnsr = isYbnsr;
    }
    /**
     * 获取自定义类型
     */
    public String getGTSBank() {
        return gTSBank;
    }

    /**
     * 设置自定义类型
     */
    public void setGTSBank(String gTSBank) {
        this.gTSBank = gTSBank;
    }
    /**
     * 获取业务伙伴编码
     */
    public String getGtsBact() {
        return gtsBact;
    }

    /**
     * 设置业务伙伴编码
     */
    public void setGtsBact(String gtsBact) {
        this.gtsBact = gtsBact;
    }
    /**
     * 获取业务伙伴名称
     */
    public String getGtsbAddr() {
        return gtsbAddr;
    }

    /**
     * 设置业务伙伴名称
     */
    public void setGtsbAddr(String gtsbAddr) {
        this.gtsbAddr = gtsbAddr;
    }
    /**
     * 获取目标单据类型
     */
    public String getSalePerson() {
        return salePerson;
    }

    /**
     * 设置目标单据类型
     */
    public void setSalePerson(String salePerson) {
        this.salePerson = salePerson;
    }
    /**
     * 获取基础单据类型
     */
    public String getZbzzk() {
        return zbzzk;
    }

    /**
     * 设置基础单据类型
     */
    public void setZbzzk(String zbzzk) {
        this.zbzzk = zbzzk;
    }
    /**
     * 获取基础单据编号
     */
    public String getZbfl() {
        return zbfl;
    }

    /**
     * 设置基础单据编号
     */
    public void setZbfl(String zbfl) {
        this.zbfl = zbfl;
    }
    /**
     * 获取汇报人
     */
    public String getBuyCard() {
        return buyCard;
    }

    /**
     * 设置汇报人
     */
    public void setBuyCard(String buyCard) {
        this.buyCard = buyCard;
    }

    public String getgTSBank() {
        return gTSBank;
    }

    public void setgTSBank(String gTSBank) {
        this.gTSBank = gTSBank;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public List<SalesOrderLine> getSalesOrderLines() {
        return salesOrderLines;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
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

    public List<SalesOrderLine> getsalesOrderLines() {
        if(salesOrderLines == null){
            salesOrderLines = new ArrayList<>();
        }
        return salesOrderLines;
    }

    public void setSalesOrderLines(List<SalesOrderLine> salesOrderLines) {
        this.salesOrderLines = salesOrderLines;
    }
}
