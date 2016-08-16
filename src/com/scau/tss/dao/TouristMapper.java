package com.scau.tss.dao;

import com.scau.tss.entity.Tourist;
import com.scau.tss.entity.TouristExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TouristMapper {
    int countByExample(TouristExample example);

    int deleteByExample(TouristExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tourist record);

    int insertSelective(Tourist record);

    List<Tourist> selectByExample(TouristExample example);

    Tourist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tourist record, @Param("example") TouristExample example);

    int updateByExample(@Param("record") Tourist record, @Param("example") TouristExample example);

    int updateByPrimaryKeySelective(Tourist record);

    int updateByPrimaryKey(Tourist record);
}