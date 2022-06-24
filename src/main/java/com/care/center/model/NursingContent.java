package com.care.center.model;

import java.math.BigDecimal;

public class NursingContent {
    private Integer id;

    private String remarks;

    private String delFlag;

    private String serialNumber;

    private int nursingLevel;

    private String nursingName;

    private BigDecimal serialPrice;

    private String describe;

    private Integer incrementFlag;

    private Integer status;

    private NursingLevel level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public int getNursingLevel() {
        return nursingLevel;
    }

    public void setNursingLevel(int nursingLevel) {
        this.nursingLevel = nursingLevel;
    }

    public String getNursingName() {
        return nursingName;
    }

    public void setNursingName(String nursingName) {
        this.nursingName = nursingName == null ? null : nursingName.trim();
    }

    public BigDecimal getSerialPrice() {
        return serialPrice;
    }

    public void setSerialPrice(BigDecimal serialPrice) {
        this.serialPrice = serialPrice;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Integer getIncrementFlag() {
        return incrementFlag;
    }

    public void setIncrementFlag(Integer incrementFlag) {
        this.incrementFlag = incrementFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public NursingLevel getLevel() {
        return level;
    }

    public void setLevel(NursingLevel level) {
        this.level = level;
    }
}