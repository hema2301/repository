package com.stackroute.pe4;

public class Occur {
	
	   public int occurenceCharacter(String str)
	   {
	       int charcount = str.length() - str.replaceAll("a", "").length();
	       return charcount;
	   }
	   
}
