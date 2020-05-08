package com.xhb.service.pojo;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

public class TagVO {
    private int id;
    private String title;
    private ArrayList<ItemsVO> serviceItemsVOS;
    private Timestamp startDate;
    private Timestamp finishDate;
    private String createUserName;
    private Timestamp createData;
    private String modificationUserName;
    private Timestamp modificationDate;
    private int status;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<ItemsVO> getServiceItemsVOS() {
        return serviceItemsVOS;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public Timestamp getFinishDate() {
        return finishDate;
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setServiceItemsVOS(ArrayList<ItemsVO> serviceItemsVOS) {
        this.serviceItemsVOS = serviceItemsVOS;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public void setFinishDate(Timestamp finishDate) {
        this.finishDate = finishDate;
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
        return "TagVO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", serviceItemsVOS=" + serviceItemsVOS +
                ", startDate=" + startDate +
                ", finishDate=" + finishDate +
                ", createUserName='" + createUserName + '\'' +
                ", createData=" + createData +
                ", modificationUserName='" + modificationUserName + '\'' +
                ", modificationDate=" + modificationDate +
                ", status=" + status +
                '}';
    }
}
