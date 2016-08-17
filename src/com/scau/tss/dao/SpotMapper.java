package com.scau.tss.dao;

import com.scau.tss.entity.Spot;
import com.scau.tss.entity.SpotExample;
import com.scau.tss.entity.SpotWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpotMapper {
    int countByExample(SpotExample example);

    int deleteByExample(SpotExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SpotWithBLOBs record);

    int insertSelective(SpotWithBLOBs record);

    List<SpotWithBLOBs> selectByExampleWithBLOBs(SpotExample example);

    List<Spot> selectByExample(SpotExample example);

    SpotWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SpotWithBLOBs record, @Param("example") SpotExample example);

    int updateByExampleWithBLOBs(@Param("record") SpotWithBLOBs record, @Param("example") SpotExample example);

    int updateByExample(@Param("record") Spot record, @Param("example") SpotExample example);

    int updateByPrimaryKeySelective(SpotWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SpotWithBLOBs record);

    int updateByPrimaryKey(Spot record);
}