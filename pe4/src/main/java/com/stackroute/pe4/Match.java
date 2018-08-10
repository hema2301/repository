package com.stackroute.pe4;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Match {
	
	    public String pattern(String s,String s1) {

	        Pattern p = Pattern.compile(s);
	        Matcher m = p.matcher(s1);
	   		String s2="";
	        while(m.find()) {
	            s2=s2+(m.start()+"-"+m.end())+" ";
	        }
			return s2.trim();
	    }
} 