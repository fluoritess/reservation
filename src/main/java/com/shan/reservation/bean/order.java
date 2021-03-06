package com.shan.reservation.bean;

import java.math.BigDecimal;
import java.util.Date;

public class order {
    private Integer orderid;

    private String orderno;

    private Integer userid;

    private Integer restaurantid;

    private BigDecimal price;

    private Byte isrefund;

    private BigDecimal delivermoney;

    private Date createtime;

    private Date deliverytime;

    private Date receivetime;

    private Byte orderstate;

    private String orderremarks;

    private Integer addressId;
    public order(String orderno, Integer userid, Integer restaurantid, BigDecimal price, Date createtime, Byte orderstate) {
        this.orderno = orderno;
        this.userid = userid;
        this.restaurantid = restaurantid;
        this.price = price;
        this.createtime = createtime;
        this.orderstate = orderstate;
    }

    public order(String orderno, Integer userid, Integer restaurantid, BigDecimal price, Date createtime, Byte orderstate, Integer addressId) {
        this.orderno = orderno;
        this.userid = userid;
        this.restaurantid = restaurantid;
        this.price = price;
        this.createtime = createtime;
        this.orderstate = orderstate;
        this.addressId = addressId;
    }

    public order(Integer orderid, String orderno, Integer userid, Integer restaurantid, BigDecimal price, Byte isrefund, BigDecimal delivermoney, Date createtime, Date deliverytime, Date receivetime, Byte orderstate, String orderremarks, Integer addressId) {
        this.orderid = orderid;
        this.orderno = orderno;
        this.userid = userid;
        this.restaurantid = restaurantid;
        this.price = price;
        this.isrefund = isrefund;
        this.delivermoney = delivermoney;
        this.createtime = createtime;
        this.deliverytime = deliverytime;
        this.receivetime = receivetime;
        this.orderstate = orderstate;
        this.orderremarks = orderremarks;
        this.addressId = addressId;
    }

    public order() {
        super();
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRestaurantid() {
        return restaurantid;
    }

    public void setRestaurantid(Integer restaurantid) {
        this.restaurantid = restaurantid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getIsrefund() {
        return isrefund;
    }

    public void setIsrefund(Byte isrefund) {
        this.isrefund = isrefund;
    }

    public BigDecimal getDelivermoney() {
        return delivermoney;
    }

    public void setDelivermoney(BigDecimal delivermoney) {
        this.delivermoney = delivermoney;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public Byte getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Byte orderstate) {
        this.orderstate = orderstate;
    }

    public String getOrderremarks() {
        return orderremarks;
    }

    public void setOrderremarks(String orderremarks) {
        this.orderremarks = orderremarks == null ? null : orderremarks.trim();
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}