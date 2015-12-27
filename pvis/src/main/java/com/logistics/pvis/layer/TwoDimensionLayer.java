/**
 * Logistics server side
 */
package com.logistics.pvis.layer;

import com.logistics.pvis.frame.Frame;

/**
 * A TwoDimensionLayer is a canvas that holds 2-D elements
 * 
 * @author Yifan
 *
 */
public class TwoDimensionLayer {
	private Frame frame;

	/**
	 * @param frame The Frame that this layer works in
	 */
	public TwoDimensionLayer(Frame frame) {
		super();
		this.frame = frame;
	}
	
}
