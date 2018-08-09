package com.stackroute.pe3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

//import static org.junit.Assert.assertTrue;
import org.junit.*;

public class MatrixTest {
	Matrix m = new Matrix();
	int noOfRows=3;
	int noOfColums=2;
	int[][] m1= {{1,2},{3,4},{5,6}};
	int[][] m2= {{9,8},{7,6},{5,4}};
	int[][] res= {{10,10},{10,10},{10,10}};
	int[][] no1= {{20,10},{20,10},{20,10}};

	 @SuppressWarnings("deprecation")
	@Test
	    public void test1() {
		 assertEquals(res, m.addition(m1,m2));
		 assertNotEquals(no1, m.addition(m1,m2));
		 assertNotNull("failure",m.addition(m1,m2));
	    	
	 }
}