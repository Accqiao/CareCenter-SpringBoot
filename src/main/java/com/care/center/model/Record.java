package com.care.center.model;

import java.util.Date;

public class Record {
    private Integer reid;

    private Date intime;

    private String indescribe;

    private String cid;

    private String rid;

    private Date outtime;

    private String outdescribe;

    private String status;

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public String getIndescribe() {
        return indescribe;
    }

    public void setIndescribe(String indescribe) {
        this.indescribe = indescribe == null ? null : indescribe.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public String getOutdescribe() {
        return outdescribe;
    }

    public void setOutdescribe(String outdescribe) {
        this.outdescribe = outdescribe == null ? null : outdescribe.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}