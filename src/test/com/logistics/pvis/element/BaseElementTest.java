package com.logistics.pvis.element;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.event.mouseevent.MouseEventHandler;

public class BaseElementTest {
	
	class BaseElementImpl extends BaseElement {

		public BaseElementImpl() {
			super();
		}
		
		@Override
		public void render() {}
		
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProcessMouseEvent() {
		MouseEventHandler handler1 = mock(MouseEventHandler.class);
		MouseEventHandler handler2 = mock(MouseEventHandler.class);
		MouseEvent event = mock(MouseEvent.class);
		
		BaseElement receiver = new BaseElementImpl();
		receiver.addMouseEventHandler(handler1);
		receiver.addMouseEventHandler(handler2);
		
		receiver.processMouseEvent(event);
		
		verify(handler1).process(event);
		verify(handler2).process(event);
	}

}
