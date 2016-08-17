package com.scau.tss.dao;

import com.scau.tss.entity.Scenery;
import com.scau.tss.entity.SceneryExample;
import com.scau.tss.entity.SceneryWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneryMapper {
    int countByExample(SceneryExample example);

    int deleteByExample(SceneryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SceneryWithBLOBs record);

    int insertSelective(SceneryWithBLOBs record);

    List<SceneryWithBLOBs> selectByExampleWithBLOBs(SceneryExample example);

    List<Scenery> selectByExample(SceneryExample example);

    SceneryWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SceneryWithBLOBs record, @Param("example") SceneryExample example);

    int updateByExampleWithBLOBs(@Param("record") SceneryWithBLOBs record, @Param("example") SceneryExample example);

    int updateByExample(@Param("record") Scenery record, @Param("example") SceneryExample example);

    int updateByPrimaryKeySelective(SceneryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SceneryWithBLOBs record);

    int updateByPrimaryKey(Scenery record);
}