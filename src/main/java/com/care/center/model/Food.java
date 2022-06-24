package com.care.center.model;

import java.math.BigDecimal;
import java.util.List;

public class Food {
    private Integer foodId;

    private String foodName;

    private String foodType;

    private String foodSign;

    private BigDecimal foodPrice;

    private String foodPhoto;

    private String isSteam;

    private String description;

    //一对多
    private List<Supply> supplyList;

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName == null ? null : foodName.trim();
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType == null ? null : foodType.trim();
    }

    public String getFoodSign() {
        return foodSign;
    }

    public void setFoodSign(String foodSign) {
        this.foodSign = foodSign == null ? null : foodSign.trim();
    }

    public BigDecimal getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(BigDecimal foodPrice) {
        this.foodPrice = foodPrice;
    }

    public String getFoodPhoto() {
        return foodPhoto;
    }

    public void setFoodPhoto(String foodPhoto) {
        this.foodPhoto = foodPhoto == null ? null : foodPhoto.trim();
    }

    public String getIsSteam() {
        return isSteam;
    }

    public void setIsSteam(String isSteam) {
        this.isSteam = isSteam == null ? null : isSteam.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public List<Supply> getSupplyList() {
        return supplyList;
    }

    public void setSupplyList(List<Supply> supplyList) {
        this.supplyList = supplyList;
    }
}