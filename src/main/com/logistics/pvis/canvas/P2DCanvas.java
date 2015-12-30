package com.logistics.pvis.canvas;

import processing.core.PConstants;
import processing.core.PGraphics;
import com.logistics.pvis.color.Color;
import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.frame.ProcessingFrame;
import com.logistics.pvis.gui.anchorpoint.AnchorPoint;

public class P2DCanvas implements Canvas, TwoDimensionCanvas {
	
	PGraphics raw;
	ProcessingFrame frame;
	
	/**
	 * @param raw
	 */
	public P2DCanvas(PGraphics raw, ProcessingFrame frame) {
		super();
		this.raw = raw;
		this.frame = frame;
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

	@Override
	public void clear(Color color) {
		raw.background(color.r, color.g, color.b, color.a);
	}

	@Override
	public void begin() {
		raw.beginDraw();
	}

	@Override
	public void end() {
		raw.endDraw();
	}

	@Override
	public void render() {
		frame.postP2DCanvas(this);
	}

	@Override
	public void setStrokeColor(Color color) {
		raw.stroke(color.r, color.g, color.b, color.a);
	}

	@Override
	public void setFillColor(Color color) {
		raw.fill(color.r, color.g, color.b, color.a);
	}

	@Override
	public void setTextAlign(AnchorPoint textAlign) {
		int horizontalAlign = 0;
		int verticalAlign = 0;
		
		switch(textAlign.getHorizontal()) {
		case Left:
			horizontalAlign = PConstants.LEFT;
			break;
		case Center:
			horizontalAlign = PConstants.CENTER;
			break;
		case Right:
			horizontalAlign = PConstants.RIGHT;
			break;
		}
		
		switch(textAlign.getVertical()) {
		case Top:
			verticalAlign = PConstants.TOP;
			break;
		case Middle:
			verticalAlign = PConstants.CENTER;
			break;
		case Bottom:
			verticalAlign = PConstants.BOTTOM;
			break;
		}
		
		raw.textAlign(horizontalAlign, verticalAlign);
	}

	/**
	 * Return the graphics
	 * @return The processing graphics
	 */
	public PGraphics getRaw() {
		return raw;
	}
}
