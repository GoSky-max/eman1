package com.dragon.emanbonlist.dao;

import com.dragon.emanbonlist.pojo.EmanListItem;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface EmanListItemMapper {
    int deleteByPrimaryKey(Integer modleno);

    int insert(EmanListItem record);

    int insertSelective(EmanListItem record);

    EmanListItem selectByPrimaryKey(Integer modleno);

    int updateByPrimaryKeySelective(EmanListItem record);

    int updateByPrimaryKey(EmanListItem record);
}