package com.scau.tss.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scau.tss.dao.HotelMapper;
import com.scau.tss.entity.Hotel;
import com.scau.tss.service.HotelService;

@Service("hotelService")
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelMapper hotelMapper;

	@Override
	public void addHotel(Hotel hotel) throws Exception {

		hotelMapper.insert(hotel);
	}

}
