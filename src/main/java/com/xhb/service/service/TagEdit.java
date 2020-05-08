package com.xhb.service.service;

import com.xhb.service.pojo.TagVO;

import java.util.ArrayList;
import java.util.Set;

public interface TagEdit {
    ArrayList<TagVO> getTagList();
    void enableTag(int id, int flag, String modificationUserName);
    Integer addTag(TagVO tag);
}
