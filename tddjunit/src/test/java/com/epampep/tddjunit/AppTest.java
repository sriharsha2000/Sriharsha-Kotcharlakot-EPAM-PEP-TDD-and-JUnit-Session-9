package com.epampep.tddjunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
	
	/*
	 * TODO List
	 * 1 - "ABCD" -> "BCD" - success
	 * 2 - "AACD" -> "CD" - success
	 * 3 - "BACD" -> "BCD" - success
	 * 4 - "BBAA" -> "BBAA" - success
	 * 5 - "AABAA" -> "BAA" - success
	 * 6 - "AA" -> "" - success
	 * 7 - "A" -> "" - success
	 * 8 - "" -> "" - success
	 */
	
	App app;
	
	@BeforeEach
	void init() {
		app = new App();
	}
	
	@Test
	void testAtFirstPosition() {
		assertEquals("BCD",app.remove("ABCD"));
	}
	
	@Test
	void testAtBothPosition() {
		assertEquals("CD",app.remove("AACD"));
	}
	
	@Test
	void testAtSecondPosition() {
		assertEquals("BCD",app.remove("BACD"));
	}
	
	@Test
	void testNoOccurance() {
		assertEquals("BBAA",app.remove("BBAA"));
	}
	
	@Test
	void testMoreOccurances() {
		assertEquals("BAA",app.remove("AABAA"));
	}
	
	@Test
	void testLength2String() {
		assertEquals("",app.remove("AA"));
	}
	
	@Test
	void testLength1String() {
		assertEquals("",app.remove("A"));
	}
	
	@Test
	void testEmptyString() {		
		assertEquals("",app.remove(""));
	}
}