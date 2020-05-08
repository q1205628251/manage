package com.xhb.service.mapper;

import com.xhb.service.pojo.ItemsVO;
import com.xhb.service.pojo.TagVO;
import org.apache.ibatis.annotations.*;
import java.util.ArrayList;


@Mapper
public interface ServiceMapper {


    @Select("select distinct(tags.tagId), tags.title, tags.startDate, tags.finishDate, tags.createUserName, tags.createData, tags.modificationUserName, tags.modificationDate, tags.status from tags left join tags_item as ti on tags.tagId = ti.tagId")
    @Results(id = "tags", value = {
            @Result(property = "id", column = "tagId"),
            @Result(property = "serviceItemsVOS", column = "tagId", many = @Many(select = "com.xhb.service.mapper.ServiceMapper.getItems"))
    })
    ArrayList<TagVO> getTags();

    @Select("select items.itemId, items.item, items.createUserName, items.createData, items.modificationUserName, items.modificationDate, items.status from items join tags_item ti on items.itemId =  ti.itemId where ti.tagId = #{tagId}")
    @Results(id = "items", value = {
            @Result(property = "id", column = "itemId")
    })
    ArrayList<ItemsVO> getItems(Integer tagId);

    @Update("UPDATE tags SET status = #{flag}, modificationUserName = #{modificationUserName}, modificationDate = now() WHERE tagId = #{id}")
    void changeTagStatus(@Param("id") int id, @Param("flag") int flag, @Param("modificationUserName") String modificationUserName);

    @Insert("INSERT INTO tags(title, startDate, finishDate, createUserName, createData, status) VALUES (#{title},#{startDate},#{finishDate},#{createUserName}, NOW(), #{status})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "tagId")
    Integer createTag(TagVO tag);

}
