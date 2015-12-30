package com.logistics.pvis.gui.guielement.button;

import com.logistics.pvis.color.Color;
import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.gui.anchorpoint.AnchorPoint;
import com.logistics.pvis.gui.guicontainer.GuiContainer;
import com.logistics.pvis.gui.guielement.GuiElementDimension;
import com.logistics.pvis.gui.guielement.GuiElementDimensionImpl;
import com.logistics.pvis.gui.guilayer.GuiLayer;
import com.logistics.pvis.shape.Shape;
import com.logistics.pvis.shape.rectangle.Rectangle;
import com.logistics.pvis.shape.text.Text;

public class ButtonFactory {
	GuiLayer layer;
	GuiContainer container;
	
	/**
	 * @param layer
	 * @param container
	 */
	public ButtonFactory(GuiLayer layer, GuiContainer container) {
		super();
		this.layer = layer;
		this.container = container;
	}

	public Button produceButton(String text,
			AnchorPoint anchorPoint,
			Dimension dimension) {
		GuiElementDimension buttonDimension = createButtonDimension(
				anchorPoint, dimension);
		Button button = new Button(buttonDimension);
		
		Dimension shapeDimension = createShapeDimension(buttonDimension);

		Shape shape = createShape(shapeDimension, button);
		button.setShape(shape);
		
		Text textShape = createTextShape(text, shapeDimension);
		button.setText(textShape);
		
		return button;
	}

	private GuiElementDimension createButtonDimension(
			AnchorPoint anchorPoint, 
			Dimension dimension) {
		GuiElementDimension buttonDimension = new GuiElementDimensionImpl();
		buttonDimension.setContainerDimension(container.getContainerDimension());
		buttonDimension.setAnchorPoint(anchorPoint);
		buttonDimension.setRelativeX((int) dimension.x);
		buttonDimension.setRelativeY((int) dimension.y);
		buttonDimension.setWidth((int) dimension.width);
		buttonDimension.setHeight((int) dimension.height);
		return buttonDimension;
	}

	private Text createTextShape(String text, Dimension shapeDimension) {
		Text textShape = new Text(layer.getCanvas());
		textShape.setText("123");
		textShape.setDimension(shapeDimension);
		textShape.setFillColor(Color.BLACK);
		textShape.setEdgeColor(Color.BLACK);
		textShape.setTextAlign(AnchorPoint.MiddleCenter);
		textShape.setText(text);
		return textShape;
	}

	private Shape createShape(Dimension shapeDimension, Button button) {
		Rectangle buttonShape = new Rectangle(layer.getCanvas());
		buttonShape.setDimension(shapeDimension);
		buttonShape.setEdgeColor(Color.BLACK);
		buttonShape.setFillColor(Color.WHITE);
		return buttonShape;
	}

	private Dimension createShapeDimension(GuiElementDimension buttonDimension) {
		Dimension shapeDimension = new Dimension(
				buttonDimension.getAbsoluteX(), 
				buttonDimension.getAbsoluteY(),
				buttonDimension.getWidth(), 
				buttonDimension.getHeight());
		return shapeDimension;
	}
}
