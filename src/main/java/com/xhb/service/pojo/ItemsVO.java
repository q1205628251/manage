package com.xhb.service.pojo;

import java.sql.Timestamp;
import java.util.Date;

public class ItemsVO {
    private int id;
    private String item;
    private String createUserName;
    private Timestamp createData;
    private String modificationUserName;
    private Timestamp modificationDate;
    private int status;

    public int getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public Timestamp getCreateData() {
        return createData;
    }

    public String getModificationUserName() {
        return modificationUserName;
    }

    public Timestamp getModificationDate() {
        return modificationDate;
    }

    public int getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public void setCreateData(Timestamp createData) {
        this.createData = createData;
    }

    public void setModificationUserName(String modificationUserName) {
        this.modificationUserName = modificationUserName;
    }

    public void setModificationDate(Timestamp modificationDate) {
        this.modificationDate = modificationDate;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ItemsVO{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", createUserName='" + createUserName + '\'' +
                ", createData=" + createData +
                ", modificationUserName='" + modificationUserName + '\'' +
                ", modificationDate=" + modificationDate +
                ", status=" + status +
                '}';
    }
}
