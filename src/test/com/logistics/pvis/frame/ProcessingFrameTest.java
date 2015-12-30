package com.logistics.pvis.frame;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import processing.core.PGraphics;

import com.logistics.pvis.canvas.P2DCanvas;
import com.logistics.pvis.scene.Scene;

public class ProcessingFrameTest {
	JFrame javaFrame;
	DelegatedPApplet pApplet;
	ProcessingFrame frame;
	Container contentPanel;

	@Before
	public void setUp() throws Exception {
		javaFrame = mock(JFrame.class);
		contentPanel = mock(Container.class);
		when(javaFrame.getContentPane()).thenReturn(contentPanel);
		pApplet = mock(DelegatedPApplet.class);
		frame = new ProcessingFrame(javaFrame, pApplet);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testShow() {
		frame.setWidth(100);
		frame.setHeight(100);
		frame.show();
		
		verify(contentPanel).setPreferredSize(new Dimension(100, 100));
		verify(javaFrame).pack();
		verify(javaFrame).add(pApplet);
		verify(pApplet).init();
		verify(javaFrame).setVisible(true);
	}

	@Test
	public void testSetCurrentScene() {
		Scene scene = mock(Scene.class);
		frame.setCurrentScene(scene);
		
		verify(pApplet).setScene(scene);
	}
	
	@Test
	public void testPostP2DCanvas() {
		P2DCanvas canvas = mock(P2DCanvas.class);
		PGraphics graphics = mock(PGraphics.class);
		when(canvas.getRaw()).thenReturn(graphics);
		frame.postP2DCanvas(canvas);
		
		verify(pApplet).image(graphics, 0, 0);
	}

}
