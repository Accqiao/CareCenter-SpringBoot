package com.care.center.model;

import java.util.Date;

public class NursingRecord {
    private Integer id;

    private String remarks;

    private String delFlag;

    private Integer customerId;

    private Integer contextId;

    private Date nursingTime;

    private int nursingContent;

    private Integer nursingCount;

    private Integer staffinfoId;

    private NursingContent content;

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

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getContextId() {
        return contextId;
    }

    public void setContextId(Integer contextId) {
        this.contextId = contextId;
    }

    public Date getNursingTime() {
        return nursingTime;
    }

    public void setNursingTime(Date nursingTime) {
        this.nursingTime = nursingTime;
    }

    public int getNursingContent() {
        return nursingContent;
    }

    public void setNursingContent(int nursingContent) {
        this.nursingContent = nursingContent;
    }

    public Integer getNursingCount() {
        return nursingCount;
    }

    public void setNursingCount(Integer nursingCount) {
        this.nursingCount = nursingCount;
    }

    public Integer getStaffinfoId() {
        return staffinfoId;
    }

    public void setStaffinfoId(Integer staffinfoId) {
        this.staffinfoId = staffinfoId;
    }

    public NursingContent getContent() {
        return content;
    }

    public void setContent(NursingContent content) {
        this.content = content;
    }

    public NursingLevel getLevel() {
        return level;
    }

    public void setLevel(NursingLevel level) {
        this.level = level;
    }
}