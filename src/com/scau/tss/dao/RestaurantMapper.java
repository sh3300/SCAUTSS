package com.scau.tss.dao;

import com.scau.tss.entity.Restaurant;
import com.scau.tss.entity.RestaurantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RestaurantMapper {
    int countByExample(RestaurantExample example);

    int deleteByExample(RestaurantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Restaurant record);

    int insertSelective(Restaurant record);

    List<Restaurant> selectByExample(RestaurantExample example);

    Restaurant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Restaurant record, @Param("example") RestaurantExample example);

    int updateByExample(@Param("record") Restaurant record, @Param("example") RestaurantExample example);

    int updateByPrimaryKeySelective(Restaurant record);

    int updateByPrimaryKey(Restaurant record);
}