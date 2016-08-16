package com.scau.tss.entity;

public class Examine {
    private Integer id;

    private String examinerId;

    private String state;

    private Byte deleted;

    private String command;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExaminerId() {
        return examinerId;
    }

    public void setExaminerId(String examinerId) {
        this.examinerId = examinerId == null ? null : examinerId.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command == null ? null : command.trim();
    }
}