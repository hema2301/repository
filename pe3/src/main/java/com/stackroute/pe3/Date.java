package com.stackroute.pe3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
//import java.util.Date;

public class Date {
	public String week()
	{
	      Calendar c = Calendar.getInstance();
   	      c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

	        System.out.println();
	       DateFormat df = new SimpleDateFormat("E dd/MM/yyyy");
	       System.out.println(df.format(c.getTime()));
	        for (int i = 0; i <6; i++) {
	         c.add(Calendar.DATE, 1);
	           }
	        return df.format(c.getTime());
	     }
	}

