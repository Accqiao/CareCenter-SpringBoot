package com.care.center.model;

import java.util.Date;

public class Distribution {
    private Integer id;

    private String cid;

    private Integer supplyId;

    private Date addDate;

    //一对一
    private Supply supply;

    //一对一
    private Customer customer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public Integer getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(Integer supplyId) {
        this.supplyId = supplyId;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}