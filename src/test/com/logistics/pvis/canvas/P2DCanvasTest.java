package com.logistics.pvis.canvas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import processing.core.PGraphics;

import com.logistics.pvis.color.Color;
import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.frame.ProcessingFrame;

import static org.mockito.Mockito.*;

public class P2DCanvasTest {
	
	PGraphics raw = null;
	TwoDimensionCanvas canvas = null;
	ProcessingFrame frame = null;

	@Before
	public void setUp() throws Exception {
		raw = mock(PGraphics.class);
		frame = mock(ProcessingFrame.class);
		canvas = new P2DCanvas(raw, frame);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRectangle() {
		canvas.rectangle(new Dimension(10, 20, 30, 40));
		
		verify(raw).rect((float)10.0, (float)20.0, 
				(float)30.0, (float)40.0);
	}
	
	@Test
	public void testText() {
		canvas.text("abcde", new Dimension(10, 20, 30, 40));
		
		verify(raw).text("abcde", (float)10.0, (float)20.0, 
				(float)30.0, (float)40.0);
	}
	
	@Test
	public void testBegin() {
		canvas.begin();
		
		verify(raw).beginDraw();
	}
	
	@Test
	public void testEnd() {
		canvas.end();
		
		verify(raw).endDraw();
	}
	
	@Test
	public void testClear() {
		canvas.clear(new Color(1, 2, 3, 4));
		
		verify(raw).background(1, 2, 3, 4);
	}
	
	@Test
	public void testRender(){
		canvas.render();
		verify(frame).image(raw, 0, 0);
	}
	
	

}
