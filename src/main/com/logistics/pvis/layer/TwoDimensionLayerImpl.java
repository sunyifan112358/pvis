/**
 * Logistics server side
 */
package com.logistics.pvis.layer;

import com.logistics.pvis.canvas.TwoDimensionCanvas;
import com.logistics.pvis.color.Color;
import com.logistics.pvis.frame.Frame;

/**
 * A TwoDimensionLayer is a canvas that holds 2-D elements
 * 
 * @author Yifan
 *
 */
public class TwoDimensionLayerImpl implements TwoDimensionLayer {
	private Frame frame;
	protected TwoDimensionCanvas canvas;

	/**
	 * Constructors
	 * @param frame The frame that this layer is working in
	 * @param canvas The canvas that this layer is providing
	 */
	public TwoDimensionLayerImpl(Frame frame, TwoDimensionCanvas canvas) {
		super();
		this.frame = frame;
		this.canvas = canvas;
	}

	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.renderable.Renderable#render()
	 */
	@Override
	public void render() {
		canvas.begin();
		canvas.clear(Color.WHITE);
		
		canvas.end();
	}

	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.layer.Layer#getCanvas()
	 */
	@Override
	public TwoDimensionCanvas getCanvas() {
		return canvas;
	}
	
}
