package com.logistics.pvis.event.mouseevent;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import processing.core.PConstants;

public class MouseEventTest {

	processing.event.MouseEvent nativeEvent = null;
	
	@Before
	public void setUp() throws Exception {
		nativeEvent = mock(processing.event.MouseEvent.class);
		when(nativeEvent.getAction()).thenReturn(
				processing.event.MouseEvent.CLICK);
		when(nativeEvent.getButton()).thenReturn(PConstants.LEFT);
		when(nativeEvent.getCount()).thenReturn(1);
		when(nativeEvent.getX()).thenReturn(0);
		when(nativeEvent.getY()).thenReturn(0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMouseEvent() {
		MouseEvent event = new MouseEvent(nativeEvent);
		assertEquals(MouseEventAction.CLICK, event.getMouseEventAction());
		assertEquals(MouseButton.LEFT, event.getMouseButton());
		assertEquals(0, event.getMousePosition().getX(), 1e-5);
		assertEquals(0, event.getMousePosition().getY(), 1e-5);
		assertEquals(1, event.getCount());
	}

	@Test
	public void testIsPropagatingAtTheBeginning() {
		MouseEvent event = new MouseEvent(nativeEvent);
		assertTrue(event.isPropagating());
	}

	@Test
	public void testStopPropagation() {
		MouseEvent event = new MouseEvent(nativeEvent);
		event.stopPropagation();
		assertFalse(event.isPropagating());
	}

}
