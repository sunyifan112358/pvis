/**
 * 
 */
package com.logistics.pvis.shape.rectangle;

import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.layer.TwoDimensionLayer;
import com.logistics.pvis.shape.Shape;

/**
 * @author Yifan
 *
 */
public class Rectangle implements Shape {
	
	private TwoDimensionLayer layer;
	private Dimension dimension;

	/**
	 * @param layer
	 */
	public Rectangle(TwoDimensionLayer layer) {
		super();
		this.layer = layer;
		this.dimension = new Dimension(0, 0, 0, 0);
	}
	
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	} 

	/* (non-Javadoc)
	 * @see com.logistics.pvis.renderable.Renderable#render()
	 */
	@Override
	public void render() {
		layer.rectangle(dimension.x, dimension.y, 
				dimension.width, dimension.height);
	}

}
