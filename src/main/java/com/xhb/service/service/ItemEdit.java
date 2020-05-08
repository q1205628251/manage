package com.xhb.service.service;

import com.xhb.service.pojo.ItemsVO;

import java.util.ArrayList;

public interface ItemEdit {
    ArrayList<ItemsVO> getItems();
    void enableTag(int id, int flag, String modificationUserName);
    Integer addItem(ItemsVO item);
    void updateItem(ItemsVO items);
}
