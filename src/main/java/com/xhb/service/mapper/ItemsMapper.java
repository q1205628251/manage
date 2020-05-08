package com.xhb.service.mapper;

import com.xhb.service.pojo.ItemsVO;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface ItemsMapper {

    @Select("select * from items")
    @Results({
            @Result(property = "id", column = "itemId")
    })
    ArrayList<ItemsVO> getItems();

    @Update("UPDATE items SET status = #{flag}, modificationUserName = #{modificationUserName}, modificationDate = now() WHERE itemId = #{id}")
    void changeTagStatus(@Param("id") int id, @Param("flag") int flag, @Param("modificationUserName") String modificationUserName);

    @Insert("INSERT INTO items(item, createUserName, createData, status) VALUES(#{item},#{createUserName}, now(), #{status})")
    Integer createItem(ItemsVO item);

    @Update("UPDATE items SET item = #{item}, modificationUserName = #{modificationUserName}, modificationDate = now() WHERE itemId = #{id}")
    void updata(ItemsVO items);
}
