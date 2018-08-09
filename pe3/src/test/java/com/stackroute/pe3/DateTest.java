package com.stackroute.pe3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

//import static org.junit.Assert.assertTrue;
import org.junit.*;

public class DateTest {
	Date d=new Date();
	@Test
	    public void test()
{
    String [] s = {"Mon 24/07/2017", "Sun 30/07/2017"};
    assertNotEquals(s, d.week());
}

@Test
public void test1()
{
    String [] s1 = {"Mon 06/08/2018", "Sun 12/08/2018"};
    assertEquals(s1, d.week());
}


@Test
public void test2()
{
    assertNotNull(d.week());    
}    
}