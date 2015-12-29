package com.logistics.pvis.canvas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import processing.core.PGraphics;

import com.logistics.pvis.dimension.Dimension;
import static org.mockito.Mockito.*;

public class P2DCanvasTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRectangle() {
		PGraphics raw = mock(PGraphics.class);
		
		TwoDimensionCanvas canvas = new P2DCanvas(raw);
		canvas.rectangle(new Dimension(10, 20, 30, 40));
		
		verify(raw).rect((float)10.0, (float)20.0, 
				(float)30.0, (float)40.0);
	}
	
	@Test
	public void testText() {
		PGraphics raw = mock(PGraphics.class);
		TwoDimensionCanvas canvas = new P2DCanvas(raw);
		
		canvas.text("abcde", new Dimension(10, 20, 30, 40));
		
		verify(raw).text("abcde", (float)10.0, (float)20.0, 
				(float)30.0, (float)40.0);
	}

}
