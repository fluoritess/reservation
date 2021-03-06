package com.shan.reservation.bean;

public class restaurant {
    private Integer restaurantId;

    private String restaurantPassword;

    private Integer restaurantAddress;

    private String restaurantPhone;

    private String restaurantName;

    private Integer restaurantState;

    private Integer restaurantCategoryId;

    private Double score;

    private String restaurantImage;

    private Integer collection;

    private String restaurantDescribe;

    private Integer sales;

    private Integer wifi;

    private Integer parkingspace;

    private String logo;

    private Double averageprice;

    public restaurant(Integer restaurantId, String restaurantPassword, Integer restaurantAddress, String restaurantPhone, String restaurantName, Integer restaurantState, Integer restaurantCategoryId, Double score, String restaurantImage, Integer collection, String restaurantDescribe, Integer sales, Integer wifi, Integer parkingspace, String logo, Double averageprice) {
        this.restaurantId = restaurantId;
        this.restaurantPassword = restaurantPassword;
        this.restaurantAddress = restaurantAddress;
        this.restaurantPhone = restaurantPhone;
        this.restaurantName = restaurantName;
        this.restaurantState = restaurantState;
        this.restaurantCategoryId = restaurantCategoryId;
        this.score = score;
        this.restaurantImage = restaurantImage;
        this.collection = collection;
        this.restaurantDescribe = restaurantDescribe;
        this.sales = sales;
        this.wifi = wifi;
        this.parkingspace = parkingspace;
        this.logo = logo;
        this.averageprice = averageprice;
    }

    public restaurant() {
        super();
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantPassword() {
        return restaurantPassword;
    }

    public void setRestaurantPassword(String restaurantPassword) {
        this.restaurantPassword = restaurantPassword == null ? null : restaurantPassword.trim();
    }

    public Integer getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(Integer restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantPhone() {
        return restaurantPhone;
    }

    public void setRestaurantPhone(String restaurantPhone) {
        this.restaurantPhone = restaurantPhone == null ? null : restaurantPhone.trim();
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName == null ? null : restaurantName.trim();
    }

    public Integer getRestaurantState() {
        return restaurantState;
    }

    public void setRestaurantState(Integer restaurantState) {
        this.restaurantState = restaurantState;
    }

    public Integer getRestaurantCategoryId() {
        return restaurantCategoryId;
    }

    public void setRestaurantCategoryId(Integer restaurantCategoryId) {
        this.restaurantCategoryId = restaurantCategoryId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getRestaurantImage() {
        return restaurantImage;
    }

    public void setRestaurantImage(String restaurantImage) {
        this.restaurantImage = restaurantImage == null ? null : restaurantImage.trim();
    }

    public Integer getCollection() {
        return collection;
    }

    public void setCollection(Integer collection) {
        this.collection = collection;
    }

    public String getRestaurantDescribe() {
        return restaurantDescribe;
    }

    public void setRestaurantDescribe(String restaurantDescribe) {
        this.restaurantDescribe = restaurantDescribe == null ? null : restaurantDescribe.trim();
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Integer getWifi() {
        return wifi;
    }

    public void setWifi(Integer wifi) {
        this.wifi = wifi;
    }

    public Integer getParkingspace() {
        return parkingspace;
    }

    public void setParkingspace(Integer parkingspace) {
        this.parkingspace = parkingspace;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public Double getAverageprice() {
        return averageprice;
    }

    public void setAverageprice(Double averageprice) {
        this.averageprice = averageprice;
    }
}