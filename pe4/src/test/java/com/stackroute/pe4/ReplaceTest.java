package com.stackroute.pe4;
import static org.junit.Assert.*;
import org.junit.Test;

public class ReplaceTest {
	
	Replace test=new Replace();
	    @Test
	    public void testFailure() 
	    {
	        String output = test.replaceStrings("ddddddddllllllll");
	        
	        assertNotEquals("fffffghtttttttt", output);
	    }
	    
	    @Test
	    public void testPass() 
	    {
	        String output = test.replaceStrings("ddddddddllllllll");
	        
	        assertEquals("fffffffftttttttt", output);
	    }
	    
	    @Test
	    public void testPass1()
	    {
	        String output = test.replaceStrings("dldldldldldldldl");
	        
	        assertEquals("ftftftftftftftft", output);
	    }
	    
	    @Test
	    public void testNull()
	    {
	        String output = test.replaceStrings("dldldldldldldldl");
	        
	        assertNotNull(output);
	    }

	}
