package com.scau.tss.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scau.tss.entity.User;
import com.scau.tss.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
  @Resource
  private IUserService userService;
  
  @RequestMapping("/showUser")
  public String toIndex(int id,Model model){
    //int userId = Integer.parseInt(request.getParameter("id"));
    User user = this.userService.getUserById(id);
    model.addAttribute("user", user);
    return "showUser";
  }
}
