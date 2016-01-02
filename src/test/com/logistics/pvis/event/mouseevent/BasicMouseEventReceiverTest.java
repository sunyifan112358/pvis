package com.logistics.pvis.event.mouseevent;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicMouseEventReceiverTest {

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
		BasicMouseEventReceiver receiver = new BasicMouseEventReceiver();
		receiver.addMouseEventHandler(handler1);
		receiver.addMouseEventHandler(handler2);
		
		receiver.processMouseEvent(event);
		
		verify(handler1).process(event);
		verify(handler2).process(event);
	}

	@Test
	public void testAddMouseEventHandler() {
		MouseEventHandler handler1 = mock(MouseEventHandler.class);
		MouseEventHandler handler2 = mock(MouseEventHandler.class);
		BasicMouseEventReceiver receiver = new BasicMouseEventReceiver();
		
		receiver.addMouseEventHandler(handler1);
		receiver.addMouseEventHandler(handler2);
		
		assertEquals(2, receiver.eventHandlers.size());
		assertSame(handler1, receiver.eventHandlers.get(0));
		assertSame(handler2, receiver.eventHandlers.get(1));
	}

}
