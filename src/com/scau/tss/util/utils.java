package com.scau.tss.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public  class utils {
	public static String getCurDate() {               //获取系统时间
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String curdate = simpleDateFormat.format(date);
		return curdate;
	}
}
