package com.stackroute.pe3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

//import static org.junit.Assert.assertTrue;
import org.junit.*;

public class ConsecTest {
	Consec c = new Consec();
	@Test
	public void testFailure() 
	{
		//String  output = {"10, 11, 12, 13, 14, 15, 16"};
		assertEquals(true, c.method("10,11,12,13,14,15,16"));
		assertNotEquals(true, c.method("10,12,13,14,15,16,17"));
		assertNotNull(c.method("0"));	
	}
}

