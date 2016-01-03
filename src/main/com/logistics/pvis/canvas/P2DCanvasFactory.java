package com.logistics.pvis.canvas;

import processing.core.PConstants;
import processing.core.PGraphics;

import com.logistics.pvis.frame.DelegatedPApplet;
import com.logistics.pvis.frame.ProcessingFrame;

public class P2DCanvasFactory {
	/**
	 * Create canvas
	 * @return
	 */
	public P2DCanvas produceCanvas(ProcessingFrame frame) {
		DelegatedPApplet applet = frame.getDelegatedPApplet();
		PGraphics graphics = applet.createGraphics(
				frame.getWidth(), frame.getHeight(), PConstants.P2D);
		P2DCanvas canvas = new P2DCanvas(graphics, frame);
		return canvas;
	}
}
