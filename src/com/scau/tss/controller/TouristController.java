package com.scau.tss.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scau.tss.entity.Tourist;
import com.scau.tss.entity.User;
import com.scau.tss.exception.CustomException;
import com.scau.tss.service.TouristService;

@Controller
@RequestMapping("/tourist")
public class TouristController {
  @Resource
  private TouristService touristService;
//  @RequestMapping("/showUser")
//  public String toIndex(int id,Model model){
//    //int userId = Integer.parseInt(request.getParameter("id"));
//    User user = this.userService.getUserById(id);
//    model.addAttribute("user", user);
//    return "showUser";
//  }
  /**
   * 游客注册
   * @param tourist
   * @param model
   * @return
   * @throws Exception
   */
  @RequestMapping(value="/enroll", method=RequestMethod.POST)
  public String enroll(Tourist tourist,Model model) throws Exception{
	  boolean result = touristService.enroll(tourist);
	  if(!result)
		  throw new CustomException("注册失败");  
	  model.addAttribute("user", tourist);
	  return "success";
	  
  }
  /**
   * 游客登录
   * @param tourist
   * @param model
   * @return
   * @throws Exception
   */
  @RequestMapping(value="/touristlogin",method=RequestMethod.POST)
  public String login(@RequestParam("account")String username,@RequestParam("password")String password,Model model) throws Exception{
	  touristService.login(username,password);
	  return "success";
  }
}
