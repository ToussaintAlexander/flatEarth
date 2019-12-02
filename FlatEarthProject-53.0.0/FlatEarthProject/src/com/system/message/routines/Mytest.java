package com.system.message.routines;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Mytest {

	public static void main(String [] args) {
		
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
		Date today = Calendar.getInstance().getTime();
		String pattern = "yyyy-MM-dd hh:mm:ss.SSS";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("en", "US"));
		String now = simpleDateFormat.format(today);
		 
		System.out.println("Current = " + timestamp);
		
		System.out.println("Format = " + now);
		
	}
	
}
