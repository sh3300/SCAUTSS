package com.scau.tss.service;

import com.scau.tss.entity.Emergency;
import com.scau.tss.entity.Page;

public interface EmergencyService {
	void create(Emergency emergency,Integer id);

	Page getList(Integer current);

	void getEmergency(Integer id);
}
