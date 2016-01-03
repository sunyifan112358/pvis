package com.logistics.pvis.gui.guielement.button;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.gui.guielement.GuiElementDimension;
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
		GuiElementDimension dimension = mock(GuiElementDimension.class);
		Dimension absDimension = new Dimension(10, 20, 30, 40);
		when(button.getGuiElementDimension()).thenReturn(dimension);
		when(dimension.getAbsoluteDimension()).thenReturn(absDimension);
		
		MouseEvent event = mock(MouseEvent.class);
		Point2D pos = new Point2D(20, 40);
		when(event.getPosition()).thenReturn(pos);
		
		DefaultButtonMouseEventHandler handler = 
				new DefaultButtonMouseEventHandler(button);
		
		assertTrue(handler.isMouseIn(event));
	}

}
