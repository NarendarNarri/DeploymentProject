package com.spring.first.project.resource;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class DateUtils {
	
	public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
	
	public static Date CreateDateFromString(String dateString) {
		
		Date date = null;
		
		if(null != dateString) {
			try {
				date = DATE_FORMAT.parse(dateString);
				
			}catch (Exception e) {
				e.printStackTrace();
				date = new Date();
			}
		} else {
			date = new Date();
		}
		
		return date; 
		
	}

}
