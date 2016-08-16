package com.scau.tss.dao;

import com.scau.tss.entity.Complaint;
import com.scau.tss.entity.ComplaintExample;
import com.scau.tss.entity.ComplaintWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplaintMapper {
    int countByExample(ComplaintExample example);

    int deleteByExample(ComplaintExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComplaintWithBLOBs record);

    int insertSelective(ComplaintWithBLOBs record);

    List<ComplaintWithBLOBs> selectByExampleWithBLOBs(ComplaintExample example);

    List<Complaint> selectByExample(ComplaintExample example);

    ComplaintWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComplaintWithBLOBs record, @Param("example") ComplaintExample example);

    int updateByExampleWithBLOBs(@Param("record") ComplaintWithBLOBs record, @Param("example") ComplaintExample example);

    int updateByExample(@Param("record") Complaint record, @Param("example") ComplaintExample example);

    int updateByPrimaryKeySelective(ComplaintWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ComplaintWithBLOBs record);

    int updateByPrimaryKey(Complaint record);
}