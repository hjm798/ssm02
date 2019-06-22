package com.bj.entity;

import com.bj.DateUtil;

import java.util.Date;
import java.util.List;

public class Order {
    private String id;//主键
    private String orderNum;//订单编号
    private Date orderTime;//下单时间
    private String orderTimeStr;
    private int orderStatus;//订单状态 （0 未支付 1 支付）
    private String orderStatusStr;//订单状态
    private int peopleCount;//出行人数
    private Integer payType; //支付类型（0 支付宝 1 微信 2 其他支付）
    private String payTypeStr;


    private String orderDesc;//订单描述

    //外键
    private Product product;//和订单是一对多的关系
    private List<Traveller> travellers; //多对多
    private Member member;//联系人     和订单一对多

    public Order() {
    }

    public String getOrderStatusStr() {
        if(orderStatus==0){
            orderStatusStr="未支付";
        }
        if(orderStatus==1){
            orderStatusStr="已支付";
        }
        return orderStatusStr;
    }

    public void setOrderStatusStr(String orderStatusStr) {
        this.orderStatusStr = orderStatusStr;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderTimeStr() {
        if(orderTime!=null){
            orderTimeStr= DateUtil.date2String(orderTime,"yyyy-MM-dd HH:mm");
        }
        return orderTimeStr;
    }

    public void setOrderTimeStr(String orderTimeStr) {
        this.orderTimeStr = orderTimeStr;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayTypeStr() {
        if(payType==0){
            payTypeStr="支付宝";
        }
        if(payType==1){
            payTypeStr="微信";
        }
        if(payType==2){
            payTypeStr="其他方式";
        }
        return payTypeStr;
    }

    public void setPayTypeStr(String payTypeStr) {
        this.payTypeStr = payTypeStr;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Traveller> getTravellers() {
        return travellers;
    }

    public void setTravellers(List<Traveller> travellers) {
        this.travellers = travellers;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
