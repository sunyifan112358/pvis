package com.logistics.pvis.canvas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import processing.core.PConstants;
import processing.core.PGraphics;

import com.logistics.pvis.color.Color;
import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.frame.ProcessingFrame;
import com.logistics.pvis.gui.anchorpoint.AnchorPoint;

import static org.mockito.Mockito.*;

public class P2DCanvasTest {
	
	PGraphics raw = null;
	P2DCanvas canvas = null;
	ProcessingFrame frame = null;

	@Before
	public void setUp() throws Exception {
		raw = mock(PGraphics.class);
		frame = mock(ProcessingFrame.class);
		canvas = new P2DCanvas(raw, frame);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRectangle() {
		canvas.rectangle(new Dimension(10, 20, 30, 40));
		
		verify(raw).rect((float)10.0, (float)20.0, 
				(float)30.0, (float)40.0);
	}
	
	@Test
	public void testText() {
		canvas.text("abcde", new Dimension(10, 20, 30, 40));
		
		verify(raw).text("abcde", (float)10.0, (float)20.0, 
				(float)30.0, (float)40.0);
	}
	
	@Test
	public void testBegin() {
		canvas.begin();
		
		verify(raw).beginDraw();
	}
	
	@Test
	public void testEnd() {
		canvas.end();
		
		verify(raw).endDraw();
	}
	
	@Test
	public void testClear() {
		canvas.clear(new Color(1, 2, 3, 4));
		
		verify(raw).background(1, 2, 3, 4);
	}
	
	@Test
	public void testRender(){
		
		canvas.render();
		verify(frame).postP2DCanvas(canvas);
	}
	
	@Test
	public void testSetStrokeColor() {
		canvas.setStrokeColor(new Color(1, 2, 3, 4));
		verify(raw).stroke(1, 2, 3, 4);
	}
	
	@Test
	public void testSetFillColor() {
		canvas.setFillColor(new Color(1, 2, 3, 4));
		verify(raw).fill(1, 2, 3, 4);
	}
	
	@Test
	public void testSetTextAlignLeftTop() {
		canvas.setTextAlign(AnchorPoint.TopLeft);
		verify(raw).textAlign(PConstants.LEFT, PConstants.TOP);
	}
	
	@Test
	public void testSetTextAlignCenterTop() {
		canvas.setTextAlign(AnchorPoint.TopCenter);
		verify(raw).textAlign(PConstants.CENTER, PConstants.TOP);
	}
	
	@Test
	public void testSetTextAlignRightTop() {
		canvas.setTextAlign(AnchorPoint.TopRight);
		verify(raw).textAlign(PConstants.RIGHT, PConstants.TOP);
	}
	
	@Test
	public void testSetTextAlignLeftCenter() {
		canvas.setTextAlign(AnchorPoint.MiddleLeft);
		verify(raw).textAlign(PConstants.LEFT, PConstants.CENTER);
	}
	
	@Test
	public void testSetTextAlignCenterCenter() {
		canvas.setTextAlign(AnchorPoint.MiddleCenter);
		verify(raw).textAlign(PConstants.CENTER, PConstants.CENTER);
	}
	
	@Test
	public void testSetTextAlignRightCenter() {
		canvas.setTextAlign(AnchorPoint.MiddleRight);
		verify(raw).textAlign(PConstants.RIGHT, PConstants.CENTER);
	}
	
	@Test
	public void testSetTextAlignLeftBottom() {
		canvas.setTextAlign(AnchorPoint.BottomLeft);
		verify(raw).textAlign(PConstants.LEFT, PConstants.BOTTOM);
	}
	
	@Test
	public void testSetTextAlignCenterBottom() {
		canvas.setTextAlign(AnchorPoint.BottomCenter);
		verify(raw).textAlign(PConstants.CENTER, PConstants.BOTTOM);
	}
	
	@Test
	public void testSetTextAlignRightBottom() {
		canvas.setTextAlign(AnchorPoint.BottomRight);
		verify(raw).textAlign(PConstants.RIGHT, PConstants.BOTTOM);
	}
	

}
