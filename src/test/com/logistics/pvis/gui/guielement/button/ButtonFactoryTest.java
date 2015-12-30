package com.logistics.pvis.gui.guielement.button;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.logistics.pvis.canvas.TwoDimensionCanvas;
import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.gui.anchorpoint.AnchorPoint;
import com.logistics.pvis.gui.guicontainer.GuiContainer;
import com.logistics.pvis.gui.guielement.GuiElementDimension;
import com.logistics.pvis.gui.guilayer.GuiLayer;

public class ButtonFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProduceButton() {
		GuiLayer layer = mock(GuiLayer.class);
		GuiContainer container = mock(GuiContainer.class);
		GuiElementDimension dimension = mock(GuiElementDimension.class);
		
		TwoDimensionCanvas canvas = mock(TwoDimensionCanvas.class);
		
		when(layer.getCanvas()).thenReturn(canvas);
		when(container.getContainerDimension()).thenReturn(dimension);
		when(dimension.getAbsoluteX()).thenReturn(100);
		when(dimension.getAbsoluteY()).thenReturn(200);
		when(dimension.getWidth()).thenReturn(1000);
		when(dimension.getHeight()).thenReturn(800);
		
		ButtonFactory factory = new ButtonFactory(layer, container);
		Button button = factory.produceButton("abcde", 
				AnchorPoint.TopLeft, 
				new Dimension(10, 20, 30, 40));
		
		assertEquals(110, button.dimension.getAbsoluteX());
		assertEquals(220, button.dimension.getAbsoluteY());
		assertEquals(30, button.dimension.getWidth());
		assertEquals(40, button.dimension.getHeight());
		
		assertEquals(110, button.shape.getDimension().x, 1e-5);
		assertEquals(220, button.shape.getDimension().y, 1e-5);
		assertEquals(30, button.shape.getDimension().width, 1e-5);
		assertEquals(40, button.shape.getDimension().height, 1e-5);
		
		assertEquals(110, button.text.getDimension().x, 1e-5);
		assertEquals(220, button.text.getDimension().y, 1e-5);
		assertEquals(30, button.text.getDimension().width, 1e-5);
		assertEquals(40, button.text.getDimension().height, 1e-5);
		
		assertEquals(dimension, button.dimension.getContainerDimension());
	}

}
