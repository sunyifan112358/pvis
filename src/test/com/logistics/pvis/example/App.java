package com.logistics.pvis.example;

import com.logistics.pvis.application.Application;
import com.logistics.pvis.canvas.P2DCanvas;
import com.logistics.pvis.canvas.P2DCanvasFactory;
import com.logistics.pvis.color.Color;
import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.frame.ProcessingFrame;
import com.logistics.pvis.gui.anchorpoint.AnchorPoint;
import com.logistics.pvis.gui.guielement.GuiElementDimension;
import com.logistics.pvis.gui.guielement.GuiElementDimensionImpl;
import com.logistics.pvis.gui.guielement.button.Button;
import com.logistics.pvis.gui.guilayer.GuiLayer;
import com.logistics.pvis.gui.guilayer.GuiLayerFactory;
import com.logistics.pvis.scene.BaseScene;
import com.logistics.pvis.scene.Scene;
import com.logistics.pvis.shape.rectangle.Rectangle;
import com.logistics.pvis.shape.text.Text;

public class App implements Application {

	ProcessingFrame frame;
	
	/**
	 * @param frame
	 */
	public App(ProcessingFrame frame) {
		super();
		this.frame = frame;
	}

	@Override
	public void start() {
		Scene scene = new BaseScene();
		
		P2DCanvasFactory canvasFactory = new P2DCanvasFactory();
		GuiLayerFactory guiLayerFactory = new GuiLayerFactory(canvasFactory);
		GuiLayer layer = guiLayerFactory.produceGuiLayer(frame);
		
		scene.addLayer(layer);
		
		addButton(layer);
		
		frame.setCurrentScene(scene);
		
		
	}
	
	private void addButton(GuiLayer layer) {
		GuiElementDimension dimension = new GuiElementDimensionImpl();
		dimension.setContainerDimension(layer.getContainerDimension());
		dimension.setAnchorPoint(AnchorPoint.BottomRight);
		dimension.setRelativeX(10);
		dimension.setRelativeY(20);
		dimension.setWidth(50);
		dimension.setHeight(40);
		Button button = new Button(dimension);
		
		Dimension shapeDimension = new Dimension(
				dimension.getAbsoluteX(), 
				dimension.getAbsoluteY(),
				dimension.getWidth(), 
				dimension.getHeight());
		
		Rectangle buttonShape = new Rectangle(layer.getCanvas());
		buttonShape.setDimension(shapeDimension);
		buttonShape.setEdgeColor(Color.BLACK);
		buttonShape.setFillColor(Color.WHITE);
		button.setShape(buttonShape);
		
		Text text = new Text(layer.getCanvas());
		text.setText("123");
		text.setDimension(shapeDimension);
		text.setFillColor(Color.BLACK);
		text.setEdgeColor(Color.BLACK);
		text.setTextAlign(AnchorPoint.MiddleCenter);
		button.setText(text);
		
		layer.addGuiElement(button);
		
	}
}
