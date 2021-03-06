package com.logistics.pvis.canvas;

import com.logistics.pvis.color.Color;
import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.gui.anchorpoint.AnchorPoint;

public interface TwoDimensionCanvas extends Canvas {

	public void rectangle(Dimension dimension);
	public void text(String text, Dimension boxDimension);
	
	public void clear(Color color);
	
	public void begin();
	public void end();
	
	public void setStrokeColor(Color color);
	public void setFillColor(Color color);
	
	public void setTextAlign(AnchorPoint textAlign);
	
	public void render();

}