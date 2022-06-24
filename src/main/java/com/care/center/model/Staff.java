package com.care.center.model;

import java.util.Date;

public class Staff {
    private Integer staffId;

    private String staffName;

    private Integer staffAge;

    private String staffSex;

    private String staffPhone;

    private String staffImg;

    private Date staffEntrytime;

    private String staffJob;

    private String staffTitle;

    private String staffBriefintroduction;

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public Integer getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(Integer staffAge) {
        this.staffAge = staffAge;
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        this.staffSex = staffSex == null ? null : staffSex.trim();
    }

    public String getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(String staffPhone) {
        this.staffPhone = staffPhone == null ? null : staffPhone.trim();
    }

    public String getStaffImg() {
        return staffImg;
    }

    public void setStaffImg(String staffImg) {
        this.staffImg = staffImg == null ? null : staffImg.trim();
    }

    public Date getStaffEntrytime() {
        return staffEntrytime;
    }

    public void setStaffEntrytime(Date staffEntrytime) {
        this.staffEntrytime = staffEntrytime;
    }

    public String getStaffJob() {
        return staffJob;
    }

    public void setStaffJob(String staffJob) {
        this.staffJob = staffJob == null ? null : staffJob.trim();
    }

    public String getStaffTitle() {
        return staffTitle;
    }

    public void setStaffTitle(String staffTitle) {
        this.staffTitle = staffTitle == null ? null : staffTitle.trim();
    }

    public String getStaffBriefintroduction() {
        return staffBriefintroduction;
    }

    public void setStaffBriefintroduction(String staffBriefintroduction) {
        this.staffBriefintroduction = staffBriefintroduction == null ? null : staffBriefintroduction.trim();
    }
}