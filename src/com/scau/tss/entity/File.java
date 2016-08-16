package com.scau.tss.entity;

import java.util.Date;

public class File {
    private Integer id;

    private String url;

    private Date times;

    private String filesType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getTimes() {
        return times;
    }

    public void setTimes(Date times) {
        this.times = times;
    }

    public String getFilesType() {
        return filesType;
    }

    public void setFilesType(String filesType) {
        this.filesType = filesType == null ? null : filesType.trim();
    }
}