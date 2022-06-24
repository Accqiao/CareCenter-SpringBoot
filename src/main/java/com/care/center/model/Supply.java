package com.care.center.model;

import java.util.Date;

public class Supply {
    private Integer supplyId;

    private Integer foodId;

    private String supplyType;

    private String supplyWeek;

    private Date addDate;

    //一对一
    private com.care.center.model.Food food;

    public Integer getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(Integer supplyId) {
        this.supplyId = supplyId;
    }

    public Integer getFoodId() {
        return foodId;
    }

    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType == null ? null : supplyType.trim();
    }

    public String getSupplyWeek() {
        return supplyWeek;
    }

    public void setSupplyWeek(String supplyWeek) {
        this.supplyWeek = supplyWeek == null ? null : supplyWeek.trim();
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public com.care.center.model.Food getFood() {
        return food;
    }

    public void setFood(com.care.center.model.Food food) {
        this.food = food;
    }
}