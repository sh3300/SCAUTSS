package com.scau.tss.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scau.tss.entity.Tourist;
import com.scau.tss.entity.User;
import com.scau.tss.service.TouristService;

@Controller
@RequestMapping("/user")
public class UserController {
  @Resource
  private TouristService touristService;
//  @RequestMapping("/showUser")
//  public String toIndex(int id,Model model){
//    //int userId = Integer.parseInt(request.getParameter("id"));
//    User user = this.userService.getUserById(id);
//    model.addAttribute("user", user);
//    return "showUser";
//  }
  
  @RequestMapping(value="/enroll", method=RequestMethod.POST)
  public String enroll(Tourist tourist,Model model){
	  boolean result = touristService.enroll(tourist);
	  model.addAttribute("user", tourist);
	  return "showUser";
	  
  }
}
