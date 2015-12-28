/**
 * Logistics server side
 */
package com.logistics.pvis.layer;

import processing.core.PGraphics;

import com.logistics.pvis.frame.Frame;

/**
 * A TwoDimensionLayer is a canvas that holds 2-D elements
 * 
 * @author Yifan
 *
 */
public class TwoDimensionLayer implements Layer {
	private Frame frame;
	protected PGraphics canvas;

	/**
	 * @param frame The Frame that this layer works in
	 */
	public TwoDimensionLayer(Frame frame, PGraphics canvas) {
		super();
		this.frame = frame;
		this.canvas = canvas;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
	}
	
	/**
	 * Draw an rectangle on the screen
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public void rectangle(double x, double y, double width, double height) {
		canvas.rect((float)x, (float)y, 
				(float)width, (float)height);
	}
	
}
