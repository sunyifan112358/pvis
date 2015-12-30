package com.logistics.pvis.gui.guilayer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.logistics.pvis.canvas.P2DCanvas;
import com.logistics.pvis.canvas.P2DCanvasFactory;
import com.logistics.pvis.frame.Frame;
import com.logistics.pvis.frame.ProcessingFrame;

public class GuiLayerFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProduceGuiLayer() {
		P2DCanvasFactory canvasFactory = mock(P2DCanvasFactory.class);
		ProcessingFrame frame = mock(ProcessingFrame.class);
		GuiLayerFactory guiLayerFactory = new GuiLayerFactory(canvasFactory);
		P2DCanvas canvas = mock(P2DCanvas.class);
		
		when(canvasFactory.produceCanvas(frame)).thenReturn(canvas);
		when(frame.getWidth()).thenReturn(100);
		when(frame.getHeight()).thenReturn(200);
		
		GuiLayer layer = guiLayerFactory.produceGuiLayer(frame);
		
		assertEquals(canvas, layer.canvas);
		assertEquals(0, layer.dimension.getAbsoluteX());
		assertEquals(0, layer.dimension.getAbsoluteY());
		assertEquals(100, layer.dimension.getWidth());
		assertEquals(200, layer.dimension.getHeight());
	}

}
