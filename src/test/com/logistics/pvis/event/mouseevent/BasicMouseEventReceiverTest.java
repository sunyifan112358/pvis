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
		BasicMouseEventReceiver receiver = new BasicMouseEventReceiver();
		GeneralMouseEventReceiverTest test = 
				new GeneralMouseEventReceiverTest(receiver);
		test.testProcessMouseEvent();
	}

}
