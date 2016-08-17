package com.scau.tss.dao;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scau.tss.entity.Hotel;

public class HotelMapperTest {

	private ApplicationContext applicationContext;

	private HotelMapper hotelMapper;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		hotelMapper = (HotelMapper) applicationContext.getBean("hotelMapper");
	}

	@Test
	public void testInsert() {
		Hotel hotel = new Hotel();
		hotel.setLevels(2);
		hotel.setNames("君华大酒店");
		hotel.setPosition("红旗大道北 99号 弘基雅居");
		hotel.setRoomNumber(99);
		hotel.setTimes(new Date());
		hotel.setTypes("非星级");
		hotelMapper.insert(hotel);
	}

}
