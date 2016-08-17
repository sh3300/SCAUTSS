package com.scau.tss.service.impl;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scau.tss.dao.EmergencyMapper;
import com.scau.tss.entity.Emergency;
import com.scau.tss.entity.Page;
import com.scau.tss.service.EmergencyService;
@Service
public class EmergencyServiceImpl implements EmergencyService{
	@Autowired
	private EmergencyMapper emergencyMapper;

		
		
		@Override
		public void create(Emergency emergency, Integer id) {
			emergency.setReleaserId(id);
			Date date = new Date();
			System.out.println(date.toString());
			emergency.setReleaseTime(date);
				System.out.println(emergency.toString());
			emergencyMapper.insert(emergency);
			
		}
		@Override
		public Page getList(Integer current) {
			System.out.println(current);
			Page page = new Page(current);
			int count = emergencyMapper.emergencyCount();
			System.out.println(count);
			page.setCount(count);
			List<Emergency> list = emergencyMapper.getList(page.getStart(),page.getSize());
			page.setList(list);
			System.out.println(list.toString());
			return page;
		}

		@Override
		public void getEmergency(Integer id) {
			
			
		}
}
