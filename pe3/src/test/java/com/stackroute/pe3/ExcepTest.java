package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExcepTest {
	String s="Bye.!!";
	Excep ex= new Excep();
	 @Test
	   public void testcase1()
	   {
		   assertEquals("Bye.!!",ex.func(s));
	   }
}
