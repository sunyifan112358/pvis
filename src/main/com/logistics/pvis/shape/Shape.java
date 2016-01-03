/**
 * 
 */
package com.logistics.pvis.shape;

import com.logistics.pvis.RectangularObject;
import com.logistics.pvis.color.Color;
import com.logistics.pvis.renderable.Renderable;

/**
 * @author Yifan
 *
 */
public interface Shape extends Renderable, RectangularObject {
	void setEdgeColor(Color edgeColor);
	void setFillColor(Color fillColor);
}
