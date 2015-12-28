package com.logistics.pvis.layer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import processing.core.PGraphics;

public class TwoDimensionLayerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRectangle() {
		PGraphics canvas = mock(PGraphics.class);
		
		TwoDimensionLayer layer = new TwoDimensionLayer(null, canvas);
		layer.rectangle(10, 20, 30, 40);
		
		verify(canvas).rect((float)10.0, (float)20.0, 
				(float)30.0, (float)40.0);
	}

}
