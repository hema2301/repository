package com.stackroute.pe4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class OccurTest {
	Occur test=new Occur();

	 @Test
	    public void testFailure() 
	    {
	        int output = test.occurenceCharacter("abaaacbaadadcdabd");
	        
	        assertNotEquals(6, output);
	    }
	    
	    @Test
	    public void testPass() 
	    {
	        int output = test.occurenceCharacter("abaaacbaadadcdabd");
	        
	        assertEquals(8, output);
	    }
	    
	    @Test
	    public void testPass1()
	    {
	        int output = test.occurenceCharacter("abaaacbaadadaaacdabd");
	        
	        assertEquals(11, output);
	    }
	    
	    @Test
	    public void testNull()
	    {
	        int output = test.occurenceCharacter("abaaacbaadadaaacdabd");
	        
	        assertNotNull(output);
	    }

	}
