package com.logistics.pvis.gui.guilayer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.logistics.pvis.canvas.P2DCanvas;
import com.logistics.pvis.gui.guielement.GuiElement;
import com.logistics.pvis.gui.guielement.GuiElementDimension;

public class GuiLayerTest {
	
	GuiLayer layer;
	GuiElement element1;
	GuiElement element2;
	P2DCanvas canvas;
	GuiElementDimension dimension;

	@Before
	public void setUp() throws Exception {
		element1 = mock(GuiElement.class);
		element2 = mock(GuiElement.class);
		canvas = mock(P2DCanvas.class);
		dimension = mock(GuiElementDimension.class);
		
		layer = new GuiLayer(canvas, dimension);
		layer.addGuiElement(element1);
		layer.addGuiElement(element2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRender() {
		layer.render();
		verify(element1).render();
		verify(element2).render();
	}
	
	@Test
	public void testGetGuiElements() {
		Set<GuiElement> elements = layer.getGuiElements();
		assertEquals(2, elements.size());
		assertTrue(elements.contains(element1));
		assertTrue(elements.contains(element2));
	}

	@Test
	public void testGetContainerDimension() {
		assertSame(dimension, layer.getContainerDimension());
	}

	@Test
	public void testGetCanvas() {
		assertSame(canvas, layer.getCanvas());
	}

}
