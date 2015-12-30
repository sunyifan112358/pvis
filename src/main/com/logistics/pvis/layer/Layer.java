/**
 * Logistics server side
 */
package com.logistics.pvis.layer;

import com.logistics.pvis.canvas.Canvas;
import com.logistics.pvis.renderable.Renderable;

/**
 * @author Yifan
 *
 */
public interface Layer extends Renderable {
	
	public Canvas getCanvas();
	
}
