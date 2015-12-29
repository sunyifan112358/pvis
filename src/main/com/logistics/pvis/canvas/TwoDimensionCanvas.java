package com.logistics.pvis.canvas;

import com.logistics.pvis.dimension.Dimension;

public interface TwoDimensionCanvas {

	public void rectangle(Dimension dimension);
	public void text(String text, Dimension boxDimension);

}