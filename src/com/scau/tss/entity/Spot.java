package com.scau.tss.entity;

public class Spot {
    private Integer id;

    private Integer sceneryid;

    private Byte deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSceneryid() {
        return sceneryid;
    }

    public void setSceneryid(Integer sceneryid) {
        this.sceneryid = sceneryid;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }
}