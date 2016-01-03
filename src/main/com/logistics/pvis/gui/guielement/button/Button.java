package com.logistics.pvis.gui.guielement.button;

import com.logistics.pvis.color.Color;
import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.element.BaseElement;
import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.event.mouseevent.MouseEventHandler;
import com.logistics.pvis.gui.guielement.GuiElement;
import com.logistics.pvis.gui.guielement.GuiElementDimension;
import com.logistics.pvis.shape.Shape;
import com.logistics.pvis.shape.text.Text;

public class Button extends BaseElement implements GuiElement {

	GuiElementDimension dimension = null;
	Shape shape = null;
	Text text = null;
	
	// Todo(Yifan):  Add support for images
			
	/**
	 * @param layer
	 */
	public Button(GuiElementDimension dimension) {
		super();
		this.dimension = dimension;
	}


	/**
	 * @return the shape
	 */
	public Shape getShape() {
		return shape;
	}


	/**
	 * @param shape the shape to set
	 */
	public void setShape(Shape shape) {
		this.shape = shape;
	}


	/**
	 * @return the text
	 */
	public Text getText() {
		return text;
	}


	/**
	 * @param text the text to set
	 */
	public void setText(Text text) {
		this.text = text;
	}


	@Override
	public void render() {
		shape.render();
		text.render();
	}


	@Override
	public GuiElementDimension getGuiElementDimension() {
		return this.dimension;
	}
	
	public void setFillColor(Color color) {
		this.getShape().setFillColor(color);
	}
	
	public Dimension getAbsoluteDimension() {
		return dimension.getAbsoluteDimension();
	}

}
