package com.stackroute.pe3;
public class Chess {
	  String[][] s = new String[8][8];
	    public String[][] demo() {
	        for (int i = 0; i < 8; i++) {
	            for (int j = 0; j < 8; j++) {
	                if((i+j)%2==0) 
	                	s[i][j]="WW|";
	                else 
	                	s[i][j]="BB|";
	            }
	        }
	        return s;
	    }
}