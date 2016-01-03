package com.logistics.pvis.color;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ColorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testColorInitFromRGBA() {
		Color color = new Color(1, 2, 3, 4);
		assertEquals(1, color.r);
		assertEquals(2, color.g);
		assertEquals(3, color.b);
		assertEquals(4, color.a);
	}

	@Test
	public void testColorInitFromRGB() {
		Color color = new Color(1, 2, 3);
		assertEquals(1, color.r);
		assertEquals(2, color.g);
		assertEquals(3, color.b);
		assertEquals(255, color.a);
	}

	@Test
	public void testColorInitFromGrayScale() {
		Color color = new Color(5);
		assertEquals(5, color.r);
		assertEquals(5, color.g);
		assertEquals(5, color.b);
		assertEquals(255, color.a);
	}
	
	@Test
	public void testEquals() {
		Color color1 = new Color(1, 2, 3, 4);
		Color color2 = new Color(1, 2, 3, 4);
		assertTrue(color1.equals(color2));
	}
	
	@Test
	public void testNotEquals() {
		Color color1 = new Color(1, 2, 3, 4);
		Color color2 = new Color(1, 2, 3, 5);
		assertFalse(color1.equals(color2));
	}

}
