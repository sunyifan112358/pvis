/**
 * Logistics server side
 */
package com.logistics.pvis.layer;

import com.logistics.pvis.canvas.TwoDimensionCanvas;
import com.logistics.pvis.frame.Frame;

/**
 * A TwoDimensionLayer is a canvas that holds 2-D elements
 * 
 * @author Yifan
 *
 */
public class TwoDimensionLayer implements Layer {
	private Frame frame;
	protected TwoDimensionCanvas canvas;

	/**
	 * @param frame The Frame that this layer works in
	 */
	public TwoDimensionLayer(Frame frame, TwoDimensionCanvas canvas) {
		super();
		this.frame = frame;
		this.canvas = canvas;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
	}
	
}
