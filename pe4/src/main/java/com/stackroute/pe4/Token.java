package com.stackroute.pe4;

import java.util.Arrays;

public class Token {
	 public String sort(String s)
	 {
		s=s.replaceAll(" ",  "").toLowerCase();
		char[] s1=s.toCharArray();
		Arrays.sort(s1);
		return (new String(s1));
	 }
  }