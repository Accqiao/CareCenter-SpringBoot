package com.care.center.model;

public class NursingLevel {
    private Integer id;

    private String remarks;

    private String delFlag;

    private String levelName;

    private Integer levelStatus;

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

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public Integer getLevelStatus() {
        return levelStatus;
    }

    public void setLevelStatus(Integer levelStatus) {
        this.levelStatus = levelStatus;
    }
}