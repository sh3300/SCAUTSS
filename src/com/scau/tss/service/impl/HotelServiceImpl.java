package com.scau.tss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scau.tss.dao.HotelMapper;
import com.scau.tss.entity.Hotel;
import com.scau.tss.entity.HotelExample;
import com.scau.tss.service.HotelService;

@Service("hotelService")
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelMapper hotelMapper;

	/**
	 * 添加酒店
	 */
	@Override
	public void addHotel(Hotel hotel) throws Exception {

		hotelMapper.insert(hotel);

	}

	/**
	 * 多添件查询酒店
	 */
	@Override
	public List<Hotel> queryHotel(Hotel hotel) throws Exception {

		HotelExample hotelExample = new HotelExample();

		HotelExample.Criteria criteria = hotelExample.createCriteria();

		if (hotel != null) {
			if (hotel.getLevels() != null) {
				criteria.andLevelsEqualTo(hotel.getLevels());
			}
			if (hotel.getNames() != null) {
				criteria.andNamesLike("%" + hotel.getNames() + "%");
			}
		}

		List<Hotel> hotelList = hotelMapper.selectByExample(hotelExample);

		return hotelList;
	}

}

