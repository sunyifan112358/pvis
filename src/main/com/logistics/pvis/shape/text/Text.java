package com.logistics.pvis.shape.text;

import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.layer.TwoDimensionLayer;
import com.logistics.pvis.shape.Shape;

public class Text implements Shape {
	
	private String text;
	private TwoDimensionLayer layer;
	private Dimension dimension;

	@Override
	public void render() {
		
	}

	@Override
	public Dimension getDimension() {
		return dimension;
	}

	@Override
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

}
