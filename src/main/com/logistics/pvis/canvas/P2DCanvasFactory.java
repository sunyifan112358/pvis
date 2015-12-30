package com.logistics.pvis.canvas;

import processing.core.PConstants;
import processing.core.PGraphics;

import com.logistics.pvis.frame.DelegatedPApplet;
import com.logistics.pvis.frame.ProcessingFrame;

public class P2DCanvasFactory {
	
	private ProcessingFrame frame;

	public P2DCanvasFactory(ProcessingFrame frame) {
		this.frame = frame;
	}
	
	/**
	 * Create canvas
	 * @return
	 */
	public P2DCanvas produceCanvas() {
		DelegatedPApplet applet = frame.getDelegatedPApplet();
		PGraphics graphics = applet.createGraphics(
				frame.getWidth(), frame.getHeight(), PConstants.P2D);
		P2DCanvas canvas = new P2DCanvas(graphics, frame);
		return canvas;
	}
}
