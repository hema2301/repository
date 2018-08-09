package com.stackroute.pe3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ChessTest {
	Chess c=new Chess();
	    
String[][] s = new String[][]{{"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
	            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
	            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
	            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
	            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
	            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
	            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
	            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};
String[][] s1 = {{"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
	            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
	            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
	            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
	            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
	            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
	            {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
	            {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}};
	    
	    @Test
	    public void testChesspattern() {
	        assertEquals(s, c.demo());
	        assertNotNull(c.demo());
	        assertNotEquals(s1, c.demo());
	    }
}