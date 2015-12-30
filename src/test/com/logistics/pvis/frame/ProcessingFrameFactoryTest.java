package com.logistics.pvis.frame;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import javax.swing.JFrame;

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
		JFrameFactory jFrameFactory = mock(JFrameFactory.class);
		JFrame jFrame = mock(JFrame.class);
		when(jFrameFactory.produceJFrame()).thenReturn(jFrame);
		
		DelegatedPAppletFactory delegatedPAppletFactory = 
				mock(DelegatedPAppletFactory.class);
		DelegatedPApplet pApplet = 
				mock(DelegatedPApplet.class);
		when(delegatedPAppletFactory.produceDelegatedPApplet())
			.thenReturn(pApplet);
		
		ProcessingFrameFactory frameFactory = new ProcessingFrameFactory(
				jFrameFactory, delegatedPAppletFactory);
		ProcessingFrame frame = frameFactory.produceProcessingFrame(100, 200);
		
		assertEquals(100, frame.getWidth());
		assertEquals(200, frame.getHeight());
		assertEquals(pApplet, frame.delegatedPApplet);
		assertEquals(jFrame, frame.javaFrame);
	}

}
