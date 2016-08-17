package com.scau.tss.service;

import java.util.List;

import com.scau.tss.entity.Hotel;

public interface HotelService {
	public void addHotel(Hotel hotel) throws Exception;

	public List<Hotel> queryHotel(Hotel hotel) throws Exception;
}
