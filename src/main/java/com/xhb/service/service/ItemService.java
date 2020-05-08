package com.xhb.service.service;

import com.xhb.service.mapper.ItemsMapper;
import com.xhb.service.pojo.ItemsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ItemService implements ItemEdit{
    @Autowired
    private ItemsMapper mapper;

    @Override
    public ArrayList<ItemsVO> getItems() {
        return mapper.getItems();
    }

    @Override
    public void enableTag(int id, int flag, String modificationUserName) {
        mapper.changeTagStatus(id,flag,modificationUserName);
    }

    @Override
    public Integer addItem(ItemsVO item) {
        return mapper.createItem(item);
    }

    @Override
    public void updateItem(ItemsVO items) {
        mapper.updata(items);
    }
}
