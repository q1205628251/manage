package com.xhb.service.controller;

import static com.xhb.service.util.RestUtil.*;

import com.xhb.service.pojo.TagVO;
import com.xhb.service.service.TagEdit;
import com.xhb.service.util.RestUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/tag")
public class TagController {

    private static final Logger logger = LoggerFactory.getLogger(TagController.class);

    @Autowired
    private TagEdit edit;

    @GetMapping("/list")
    public Rest<ArrayList> getList(){
        ArrayList<TagVO> tagList;
        try {
            tagList = edit.getTagList();
        }catch (Exception ex){
            logger.error("err {}", ex);
            return RestUtil.error();
        }
        return RestUtil.wrap(tagList);
    }

    @PostMapping("/enable")
    public Rest enableTag(int id, int flag, String modificationUserName){
        try {
            edit.enableTag(id, flag, modificationUserName);
        }catch (Exception ex){
            logger.error("err {}", ex);
            return RestUtil.error();
        }
        return RestUtil.success();
    }

    @PostMapping("/create")
    public Rest createTag(@RequestBody TagVO tag){
        try {
            if (edit.addTag(tag) != null); return RestUtil.success();
        }catch (Exception ex){
            logger.error("err {}", ex);
            return RestUtil.error();
        }
    }


    @PostMapping("/update")
    public Rest<TagVO> updateTag(@RequestBody TagVO tag){

        return null;
    }




}
