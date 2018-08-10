package com.stackroute.pe4;
public class Transp {
	   public String[] reverse(String[] str)
	   {
		   for (int i = 0; i < str.length; i++)
	        {
	           StringBuilder sb=new StringBuilder();
	           sb.append(str[i]);
	           sb.reverse();
	           str[i]=sb.toString();
	        }
		return str;
	   }
}
