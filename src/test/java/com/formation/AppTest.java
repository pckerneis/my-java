package com.formation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	private String INPUT ="12345";
	
	@Test
	public void testLength() {
		System.out.println("testLength");
		assertEquals(64, App.sha256(INPUT).length());
	}
	
	@Test
	public void testHex() {
		System.out.println("testHex");
		String expected = "5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5";
		assertEquals(expected, App.sha256(INPUT));
	}
	
	@Test
	public void testSuperieur() {
		System.out.println("testSuperieur");
		assertEquals("Bye", App.f(20));
	}

}
