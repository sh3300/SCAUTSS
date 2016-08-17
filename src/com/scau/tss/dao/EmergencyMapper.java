package com.scau.tss.dao;

import com.scau.tss.entity.Emergency;
import com.scau.tss.entity.EmergencyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmergencyMapper {
    int countByExample(EmergencyExample example);

    int deleteByExample(EmergencyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Emergency record);

    int insertSelective(Emergency record);

    List<Emergency> selectByExample(EmergencyExample example);

    Emergency selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Emergency record, @Param("example") EmergencyExample example);

    int updateByExample(@Param("record") Emergency record, @Param("example") EmergencyExample example);

    int updateByPrimaryKeySelective(Emergency record);

    int updateByPrimaryKey(Emergency record);
    int emergencyCount();
    List<Emergency> getList(@Param("start") int start ,@Param("size") int size);
}