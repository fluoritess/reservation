package com.shan.reservation.bean;

import java.util.Date;

public class user {
    private Integer userId;

    private String userPassword;

    private String userPhone;

    private Integer userAddress;

    private String userSex;

    private String userImag;

    private String realname;

    private String userName;

    private Integer userState;

    private Date lastDate;

    private String userEmail;

    private Date thisDate;

    public user(Integer userId, String userPassword, String userPhone, String realname, String userName, Integer userState) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
        this.realname = realname;
        this.userName = userName;
        this.userState = userState;
    }

    public user(Integer userId, String userPassword, String userPhone, Integer userAddress, String userSex, String userImag, String realname, String userName, Integer userState, Date lastDate, String userEmail, Date thisDate) {
        this.userId = userId;
        this.userPassword = userPassword;
        this.userPhone = userPhone;
        this.userAddress = userAddress;
        this.userSex = userSex;
        this.userImag = userImag;
        this.realname = realname;
        this.userName = userName;
        this.userState = userState;
        this.lastDate = lastDate;
        this.userEmail = userEmail;
        this.thisDate = thisDate;
    }

    public user() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(Integer userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserImag() {
        return userImag;
    }

    public void setUserImag(String userImag) {
        this.userImag = userImag == null ? null : userImag.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Date getThisDate() {
        return thisDate;
    }

    public void setThisDate(Date thisDate) {
        this.thisDate = thisDate;
    }
}