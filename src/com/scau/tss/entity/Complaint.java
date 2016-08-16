package com.scau.tss.entity;

import java.util.Date;

public class Complaint {
    private Integer id;

    private String title;

    private String touristId;

    private Date times;

    private String state;

    private Integer access;

    private String examinerId;

    private String managerId;

    private String resultId;

    private Integer resId;

    private Integer filesId;

    private Byte deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTouristId() {
        return touristId;
    }

    public void setTouristId(String touristId) {
        this.touristId = touristId == null ? null : touristId.trim();
    }

    public Date getTimes() {
        return times;
    }

    public void setTimes(Date times) {
        this.times = times;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }

    public String getExaminerId() {
        return examinerId;
    }

    public void setExaminerId(String examinerId) {
        this.examinerId = examinerId == null ? null : examinerId.trim();
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId == null ? null : managerId.trim();
    }

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId == null ? null : resultId.trim();
    }

    public Integer getResId() {
        return resId;
    }

    public void setResId(Integer resId) {
        this.resId = resId;
    }

    public Integer getFilesId() {
        return filesId;
    }

    public void setFilesId(Integer filesId) {
        this.filesId = filesId;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }
}