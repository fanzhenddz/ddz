package com.ddz.entity;

import java.io.Serializable;
import java.util.Date;

/***
 *
 */
public class TbOrder implements Serializable {
    //订单id
    private String id;
    //数量合计
    private Integer totalNum;
    //金额合计
    private Integer totalMoney;
    //优惠金额
    private Integer preMoney;
    //邮费
    private Integer postFee;
    //实付金额
    private Integer payMoney;
    //支付类型，1、在线支付、0 货到付款
    private String payType;
    //订单创建时间
    private Date createTime;
    //订单更新时间
    private Date updateTime;
    //付款时间
    private Date payTime;
    //发货时间
    private Date consignTime;
    //交易完成时间
    private Date endTime;
    //交易关闭时间
    private Date closeTime;
    //物流名称
    private String shippingName;
    //物流单号
    private String shippingCode;
    //用户名称
    private String username;
    //买家留言
    private String buyerMessage;
    //是否评价
    private String buyerRate;
    //收货人
    private String receiverContact;
    //收货人手机
    private String receiverMobile;
    //收货人地址
    private String receiverAddress;
    //订单来源：1:web，2：app，3：微信公众号，4：微信小程序  5 H5手机页面
    private String sourceType;
    //交易流水号
    private String transactionId;
    //订单状态 
    private String orderStatus;
    //支付状态 0:未支付 1:已支付
    private String payStatus;
    //发货状态 0:未发货 1:已发货 2:已送达
    private String consignStatus;
    //是否删除
    private String isDelete;

    //get set 方法
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getTotalNum() {
        return this.totalNum;
    }

    public void setTotalMoney(Integer totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Integer getTotalMoney() {
        return this.totalMoney;
    }

    public void setPreMoney(Integer preMoney) {
        this.preMoney = preMoney;
    }

    public Integer getPreMoney() {
        return this.preMoney;
    }

    public void setPostFee(Integer postFee) {
        this.postFee = postFee;
    }

    public Integer getPostFee() {
        return this.postFee;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getPayMoney() {
        return this.payMoney;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getPayType() {
        return this.payType;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getPayTime() {
        return this.payTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getConsignTime() {
        return this.consignTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Date getCloseTime() {
        return this.closeTime;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public String getShippingName() {
        return this.shippingName;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public String getShippingCode() {
        return this.shippingCode;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    public String getBuyerMessage() {
        return this.buyerMessage;
    }

    public void setBuyerRate(String buyerRate) {
        this.buyerRate = buyerRate;
    }

    public String getBuyerRate() {
        return this.buyerRate;
    }

    public void setReceiverContact(String receiverContact) {
        this.receiverContact = receiverContact;
    }

    public String getReceiverContact() {
        return this.receiverContact;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getReceiverMobile() {
        return this.receiverMobile;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSourceType() {
        return this.sourceType;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return this.transactionId;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayStatus() {
        return this.payStatus;
    }

    public void setConsignStatus(String consignStatus) {
        this.consignStatus = consignStatus;
    }

    public String getConsignStatus() {
        return this.consignStatus;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getIsDelete() {
        return this.isDelete;
    }

    @Override
    public String toString() {
        return "TbOrder{" +
                "id='" + id + '\'' +
                ", totalNum=" + totalNum +
                ", totalMoney=" + totalMoney +
                ", preMoney=" + preMoney +
                ", postFee=" + postFee +
                ", payMoney=" + payMoney +
                ", payType='" + payType + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", payTime=" + payTime +
                ", consignTime=" + consignTime +
                ", endTime=" + endTime +
                ", closeTime=" + closeTime +
                ", shippingName='" + shippingName + '\'' +
                ", shippingCode='" + shippingCode + '\'' +
                ", username='" + username + '\'' +
                ", buyerMessage='" + buyerMessage + '\'' +
                ", buyerRate='" + buyerRate + '\'' +
                ", receiverContact='" + receiverContact + '\'' +
                ", receiverMobile='" + receiverMobile + '\'' +
                ", receiverAddress='" + receiverAddress + '\'' +
                ", sourceType='" + sourceType + '\'' +
                ", transactionId='" + transactionId + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", payStatus='" + payStatus + '\'' +
                ", consignStatus='" + consignStatus + '\'' +
                ", isDelete='" + isDelete + '\'' +
                '}';
    }
}
