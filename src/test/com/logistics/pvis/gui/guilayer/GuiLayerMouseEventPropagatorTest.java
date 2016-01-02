package com.logistics.pvis.gui.guilayer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.gui.guielement.GuiElement;

public class GuiLayerMouseEventPropagatorTest {
	
	GuiLayer layer;
	GuiElement element1;
	GuiElement element2;
	Set<GuiElement> elements;
	GuiLayerMouseEventPropagator propagator;
	MouseEvent event;
	

	@Before
	public void setUp() throws Exception {
		layer = mock(GuiLayer.class);
		element1 = mock(GuiElement.class);
		element2 = mock(GuiElement.class);
		
		elements = new HashSet<GuiElement>();
		elements.add(element1);
		elements.add(element2);
		when(layer.getGuiElements()).thenReturn(elements);
		
		propagator = new GuiLayerMouseEventPropagator(layer);
		
		event = mock(MouseEvent.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProcessShouldPropagate() {
		when(event.isPropagating()).thenReturn(true);
		
		propagator.process(event);
		
		verify(element1).processMouseEvent(event);
		verify(element2).processMouseEvent(event);
	}
	@Test
	public void testProcessShouldStopPropagate() {
		when(event.isPropagating())
			.thenReturn(true)
			.thenReturn(false);
		
		propagator.process(event);
		
		verify(element1).processMouseEvent(event);
		verify(element2, never()).processMouseEvent(event);
	}

}
