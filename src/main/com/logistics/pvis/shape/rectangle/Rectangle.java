/**
 * 
 */
package com.logistics.pvis.shape.rectangle;

import com.logistics.pvis.canvas.TwoDimensionCanvas;
import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.layer.TwoDimensionLayerImpl;
import com.logistics.pvis.shape.Shape;

/**
 * @author Yifan
 *
 */
public class Rectangle implements Shape {
	
	private TwoDimensionCanvas canvas;
	private Dimension dimension;

	/**
	 * @param layer
	 */
	public Rectangle(TwoDimensionCanvas canvas) {
		super();
		this.canvas = canvas;
		this.dimension = new Dimension(0, 0, 0, 0);
	}
	
	/* (non-Javadoc)
	 * @see com.logistics.pvis.renderable.Renderable#render()
	 */
	@Override
	public void render() {
		canvas.rectangle(dimension);
	}

	@Override
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	} 

	@Override
	public Dimension getDimension() {
		return dimension;
	}

}
