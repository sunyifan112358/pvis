package com.logistics.pvis.canvas;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PGraphics;

import com.logistics.pvis.frame.DelegatedPApplet;
import com.logistics.pvis.frame.ProcessingFrame;

public class P2DCanvasFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProduceCanvas() {
		ProcessingFrame frame = mock(ProcessingFrame.class);
		DelegatedPApplet applet = mock(DelegatedPApplet.class);
		PGraphics pGraphics = mock(PGraphics.class);
		P2DCanvasFactory factory = new P2DCanvasFactory();
		
		when(frame.getDelegatedPApplet()).thenReturn(applet);
		when(applet.createGraphics(frame.getWidth(), frame.getHeight(), 
				PConstants.P2D)).thenReturn(pGraphics);
		
		P2DCanvas canvas = factory.produceCanvas(frame);
		assertEquals(pGraphics, canvas.raw);
		assertEquals(frame, canvas.frame);
	}

}
