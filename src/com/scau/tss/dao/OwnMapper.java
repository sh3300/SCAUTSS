package com.scau.tss.dao;

import com.scau.tss.entity.Own;
import com.scau.tss.entity.OwnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OwnMapper {
    int countByExample(OwnExample example);

    int deleteByExample(OwnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Own record);

    int insertSelective(Own record);

    List<Own> selectByExample(OwnExample example);

    Own selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Own record, @Param("example") OwnExample example);

    int updateByExample(@Param("record") Own record, @Param("example") OwnExample example);

    int updateByPrimaryKeySelective(Own record);

    int updateByPrimaryKey(Own record);
}