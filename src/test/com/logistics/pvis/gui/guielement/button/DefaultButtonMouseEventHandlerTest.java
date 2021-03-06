package com.logistics.pvis.gui.guielement.button;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.logistics.pvis.color.Color;
import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.event.mouseevent.MouseEventAction;
import com.logistics.pvis.point.Point2D;

public class DefaultButtonMouseEventHandlerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsMouseIn() {
		Button button = mock(Button.class);
		Dimension dimension = new Dimension(10, 20, 30, 40);
		when(button.getAbsoluteDimension()).thenReturn(dimension);
		
		MouseEvent event = mock(MouseEvent.class);
		Point2D pos = new Point2D(20, 40);
		when(event.getPosition()).thenReturn(pos);
		
		DefaultButtonMouseEventHandler handler = 
				new DefaultButtonMouseEventHandler(button);
		
		assertTrue(handler.isMouseIn(event));
	}
	
	@Test
	public void testProcessMouseMoveIn() {
		Button button = mock(Button.class);
		DefaultButtonMouseEventHandler handler = 
				new DefaultButtonMouseEventHandler(button);
		MouseEvent event = mock(MouseEvent.class);

		when(button.getAbsoluteDimension()).thenReturn(
				new Dimension(10, 20, 30, 40));
		when(event.getPosition()).thenReturn(new Point2D(30, 40));
		when(event.getAction()).thenReturn(MouseEventAction.MOVE);
		
		handler.process(event);
		
		Color hoverColor = new Color(250);
		verify(button).setFillColor(eq(hoverColor));
		
	}

}
