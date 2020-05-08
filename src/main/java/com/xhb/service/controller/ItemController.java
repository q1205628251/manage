package com.xhb.service.controller;

import static com.xhb.service.util.RestUtil.Rest;
import com.xhb.service.pojo.ItemsVO;
import com.xhb.service.service.ItemEdit;
import com.xhb.service.util.RestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/item")
public class ItemController {

    private static final Logger logger = LoggerFactory.getLogger(ItemController.class);


    @Autowired
    private ItemEdit edit;

    @GetMapping("/list")
    public Rest<ArrayList> getItemList(){
        ArrayList<ItemsVO> items = edit.getItems();
        return RestUtil.wrap(items);
    }

    @PostMapping("enable")
    public Rest enableItem(int id, int flag, String modificationUserName){
        try {
            edit.enableTag(id, flag, modificationUserName);
        }catch (Exception ex){
            logger.error("err {}", ex);
            return RestUtil.error();
        }
        return RestUtil.success();
    }

    @PostMapping("create")
    public Rest createItem(ItemsVO item){
        try {
            if (edit.addItem(item) != null); return RestUtil.success();
        }catch (Exception ex){
            logger.error("err {}", ex);
            return RestUtil.error();
        }
    }


    @PostMapping("update")
    public Rest<ItemsVO> updateItem(ItemsVO item){
        try {
            edit.updateItem(item);
        }catch (Exception ex){
            logger.error("err {}", ex);
            return RestUtil.error();
        }
        return RestUtil.success();
    }

}
