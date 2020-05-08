package com.xhb.service.service;

import com.xhb.service.mapper.ServiceMapper;
import com.xhb.service.pojo.TagVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Service
public class TagService implements TagEdit{

    private static final Logger logger = LoggerFactory.getLogger(TagService.class);

    @Autowired
    private ServiceMapper mapper;

    @Override
    public ArrayList<TagVO> getTagList() {
        ArrayList<TagVO> tags = mapper.getTags();
        Set<TagVO> set = new HashSet<>();
        for (TagVO tag: tags) {
            set.add(tag);
        }

        logger.info(tags.toString());
        logger.info(set.toString());
        return tags;
    }

    @Override
    public void enableTag(int id, int flag, String modificationUserName) {
        mapper.changeTagStatus(id, flag, modificationUserName);
    }

    @Override
    public Integer addTag(TagVO tag) {
        return mapper.createTag(tag);
    }
}
