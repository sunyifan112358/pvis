package com.logistics.pvis.event.mouseevent;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GeneralMouseEventReceiverTest {
	MouseEventReceiver receiver;
	
	public GeneralMouseEventReceiverTest(MouseEventReceiver receiverUnderTest) {
		this.receiver = receiverUnderTest;
	}

	public void testProcessMouseEvent() {
		MouseEventHandler handler1 = mock(MouseEventHandler.class);
		MouseEventHandler handler2 = mock(MouseEventHandler.class);
		MouseEvent event = mock(MouseEvent.class);
		receiver.addMouseEventHandler(handler1);
		receiver.addMouseEventHandler(handler2);
		
		receiver.processMouseEvent(event);
		
		verify(handler1).process(event);
		verify(handler2).process(event);
	}
}
