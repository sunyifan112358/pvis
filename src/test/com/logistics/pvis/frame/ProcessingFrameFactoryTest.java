package com.logistics.pvis.frame;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ProcessingFrameFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProduceProcessingFrame() {
		ProcessingFrameFactory frameFactory = new ProcessingFrameFactory();
		ProcessingFrame frame = frameFactory.produceProcessingFrame(100, 200);
		
		assertEquals(100, frame.getWidth());
		assertEquals(200, frame.getHeight());
	}

}
