package com.logistics.pvis.canvas;

import processing.core.PGraphics;

import com.logistics.pvis.dimension.Dimension;

public class P2DCanvas implements Canvas, TwoDimensionCanvas {
	
	private PGraphics raw;
	
	/**
	 * @param raw
	 */
	public P2DCanvas(PGraphics raw) {
		super();
		this.raw = raw;
	}

	/* (non-Javadoc)
	 * @see com.logistics.pvis.canvas.TwoDimensionCanvas#rectangle(com.logistics.pvis.dimension.Dimension)
	 */
	@Override
	public void rectangle(Dimension dimension) {
		raw.rect((float)dimension.x, (float)dimension.y, 
				(float)dimension.width, (float)dimension.height);
	}

	@Override
	public void text(String text, Dimension boxDimension) {
		raw.text(text, 
				(float)boxDimension.x, (float)boxDimension.y, 
				(float)boxDimension.width, (float)boxDimension.height);
	}
}
