package com.dragon.emanbonlist.dao;

import com.dragon.emanbonlist.pojo.EmanList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmanListMapper {
    int deleteByPrimaryKey(Integer modleno);

    int insert(EmanList record);

    int insertSelective(EmanList record);

    EmanList selectByPrimaryKey(Integer modleno);

    @Select("select * from eman_list")
    List<EmanList> selectBomList();

    int updateByPrimaryKeySelective(EmanList record);

    int updateByPrimaryKey(EmanList record);
}