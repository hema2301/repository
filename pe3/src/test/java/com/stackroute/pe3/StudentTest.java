package com.stackroute.pe3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class StudentTest {
	Student s = new Student();
	int studentgrades[] = new int[] {45,87,87,98};
	int studentgrades1[]  = new int[] {65,87,981,98};
	@Test
	public void test() {
		assertEquals("Invalid-Grades",s.stud(studentgrades1));
		assertEquals("Valid-Grades",s.stud(studentgrades));
		assertNotEquals("Invalid-Grades",s.stud(studentgrades));
	}

}