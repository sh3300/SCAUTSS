package com.scau.tss.dao;

import com.scau.tss.entity.Performer;
import com.scau.tss.entity.PerformerExample;
import com.scau.tss.entity.PerformerWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerformerMapper {
    int countByExample(PerformerExample example);

    int deleteByExample(PerformerExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PerformerWithBLOBs record);

    int insertSelective(PerformerWithBLOBs record);

    List<PerformerWithBLOBs> selectByExampleWithBLOBs(PerformerExample example);

    List<Performer> selectByExample(PerformerExample example);

    PerformerWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PerformerWithBLOBs record, @Param("example") PerformerExample example);

    int updateByExampleWithBLOBs(@Param("record") PerformerWithBLOBs record, @Param("example") PerformerExample example);

    int updateByExample(@Param("record") Performer record, @Param("example") PerformerExample example);

    int updateByPrimaryKeySelective(PerformerWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(PerformerWithBLOBs record);

    int updateByPrimaryKey(Performer record);
}