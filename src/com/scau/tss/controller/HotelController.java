package com.scau.tss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scau.tss.entity.Hotel;
import com.scau.tss.service.HotelService;

@Controller
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	/**
	 * 添加酒店
	 * 
	 * @param hotel
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addHotel")
	public String addHotel(Hotel hotel) throws Exception {
		hotelService.addHotel(hotel);
		return "success";
	}

	@RequestMapping("/queryHotel")
	public String queryHotel(Model model, Hotel hotel) throws Exception {

		List<Hotel> hotelList = hotelService.queryHotel(hotel);

		model.addAttribute("hotelList", hotelList);

		return "hotel/hotelList";
	}

}
