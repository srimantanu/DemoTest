package com.test.springboot.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


	public static Date convertStringToDate(String dateTimeformat, String date) throws ParseException {
		Date currentDate=null;
		
		if(date!=null) {
		SimpleDateFormat formatter = new SimpleDateFormat(dateTimeformat);
		
		 currentDate = formatter.parse(date);
		}
		//System.out.println("currentDate->"+currentDate); 
		return currentDate;
	}
	
	public static String convertDateToString(String dateTimeformat, Date date) throws ParseException {
		String currentDate="";
		//if(date!=null) {
			SimpleDateFormat formatter = new SimpleDateFormat(dateTimeformat);
			
			 currentDate = formatter.format(date);
			//System.out.println("currentDate->"+currentDate); 
			
		//}
		return currentDate; 
		
	}
	
	
}
