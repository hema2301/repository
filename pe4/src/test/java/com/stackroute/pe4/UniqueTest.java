package com.stackroute.pe4;

import static org.junit.Assert.*;
import org.junit.Test;

public class UniqueTest {
	Unique test=new Unique();
		    @Test
	    public void testFailure() 
	    {
	        String output = test.twoUniqueCharacters("abcbdbdbbdcdabd", 2);
	        
	        assertNotEquals("abcbdbdb", output);
	    }
	    
	    @Test
	    public void testPass()
	    {
	        String output = test.twoUniqueCharacters("abcbdbdbbdcdabd", 2);
	        
	        assertEquals("bdbdbbd", output);
	    }
	    
	    @Test
	    public void testPass1()
	    {
	        String output = test.twoUniqueCharacters("qweewuuuwww", 2);
	        
	        assertEquals("wuuuwww", output);
	    }
	    
	    @Test
	    public void testNull()
	    {
	        String output = test.twoUniqueCharacters("abcbdbdbbdcdabd", 2);
	        
	        assertNotNull(output);
	    }

	}
