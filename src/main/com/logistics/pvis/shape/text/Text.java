package com.logistics.pvis.shape.text;

import com.logistics.pvis.canvas.TwoDimensionCanvas;
import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.layer.TwoDimensionLayer;
import com.logistics.pvis.shape.Shape;

public class Text implements Shape {
	
	private String text;
	private TwoDimensionCanvas canvas;
	private Dimension dimension;

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

}
