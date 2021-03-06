package com.scau.tss.dao;

import com.scau.tss.entity.Result;
import com.scau.tss.entity.ResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResultMapper {
    int countByExample(ResultExample example);

    int deleteByExample(ResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Result record);

    int insertSelective(Result record);

    List<Result> selectByExampleWithBLOBs(ResultExample example);

    List<Result> selectByExample(ResultExample example);

    Result selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Result record, @Param("example") ResultExample example);

    int updateByExampleWithBLOBs(@Param("record") Result record, @Param("example") ResultExample example);

    int updateByExample(@Param("record") Result record, @Param("example") ResultExample example);

    int updateByPrimaryKeySelective(Result record);

    int updateByPrimaryKeyWithBLOBs(Result record);

    int updateByPrimaryKey(Result record);
}