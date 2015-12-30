package com.logistics.pvis.canvas;

import com.logistics.pvis.color.Color;
import com.logistics.pvis.dimension.Dimension;

public interface TwoDimensionCanvas {

	public void rectangle(Dimension dimension);
	public void text(String text, Dimension boxDimension);
	
	public void clear(Color color);
	
	public void begin();
	public void end();

}