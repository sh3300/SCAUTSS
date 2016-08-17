package com.scau.tss.controller;

import javax.annotation.Resource;
import javax.jws.WebParam.Mode;
import javax.servlet.http.HttpSession;

import org.junit.runners.Parameterized.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

import com.scau.tss.entity.Emergency;
import com.scau.tss.entity.Manager;
import com.scau.tss.entity.Page;
import com.scau.tss.service.EmergencyService;


@Controller
@RequestMapping("/emergency")
public class EmergencyController {
	@Resource
	private EmergencyService emergencyService;
	/*
	 * 
	 */
	@RequestMapping("/create")
	public void createEmergency( Emergency emergency,HttpSession httpSession, Model model){
		Manager m = new Manager();
		m.setId(1);
		httpSession.setAttribute("manager", m);
		Manager manager =(Manager) httpSession.getAttribute("manager");
		int id = manager.getId();
		emergencyService.create(emergency,id);
	}
	/*
	 * 
	 */
	@RequestMapping("/load")
	public ModelAndView getEmergencyList(){
		
		int	current = 1;
		Page page = emergencyService.getList(current);
		System.out.println(page.toString());
		return null;
	}
	/*
	 * 
	 */
	@RequestMapping("getEmergency")
	public ModelAndView getEmergency(@RequestParam("id") Integer id){
		emergencyService.getEmergency(id);
		return null;
	}
}
