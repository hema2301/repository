package com.stackroute.pe3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PlacesTest {
	Places p = new Places();
	String[] sr = { "India","United States","Germany","Egypt","Czechoslovakia"};
	@Test
	public void testVowel() {
		
		assertEquals("nd,ntd stts,Grmny,gypt,Czchslvk",p.vowel(sr));
		assertNotEquals("nda,ntd stats,Germy,Egypt,Czecchslvk",p.vowel(sr));
	}

}
