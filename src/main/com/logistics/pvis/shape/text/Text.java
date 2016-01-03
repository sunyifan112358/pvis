package com.logistics.pvis.shape.text;

import com.logistics.pvis.canvas.TwoDimensionCanvas;
import com.logistics.pvis.color.Color;
import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.gui.anchorpoint.AnchorPoint;
import com.logistics.pvis.layer.TwoDimensionLayerImpl;
import com.logistics.pvis.shape.Shape;

public class Text implements Shape {
	
	private String text;
	private TwoDimensionCanvas canvas;
	private Dimension dimension;
	private Color edgeColor;
	private Color fillColor;
	private AnchorPoint textAlign;

	/**
	 * @param canvas
	 */
	public Text(TwoDimensionCanvas canvas) {
		super();
		this.canvas = canvas;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public void render() {
		canvas.setFillColor(fillColor);
		canvas.setStrokeColor(edgeColor);
		canvas.setTextAlign(textAlign);
		canvas.text(text, dimension);
	}

	@Override
	public Dimension getDimension() {
		return dimension;
	}

	@Override
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	@Override
	public void setEdgeColor(Color edgeColor) {
		this.edgeColor = edgeColor;
	}

	@Override
	public void setFillColor(Color fillColor) {
		this.fillColor = fillColor;
	}
	
	public void setTextAlign(AnchorPoint textAlign) {
		this.textAlign = textAlign;
	}

}
