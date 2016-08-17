package com.scau.tss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scau.tss.entity.Hotel;
import com.scau.tss.service.HotelService;

@Controller
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@RequestMapping("/addHotel")
	public String addHotel(Hotel hotel) throws Exception {
		hotelService.addHotel(hotel);
		return "success";
	}

}
