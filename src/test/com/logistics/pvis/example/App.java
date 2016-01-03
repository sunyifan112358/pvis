package com.logistics.pvis.example;

import com.logistics.pvis.application.Application;
import com.logistics.pvis.canvas.P2DCanvasFactory;
import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.frame.ProcessingFrame;
import com.logistics.pvis.gui.anchorpoint.AnchorPoint;
import com.logistics.pvis.gui.guielement.button.Button;
import com.logistics.pvis.gui.guielement.button.ButtonFactory;
import com.logistics.pvis.gui.guielement.button.DefaultButtonMouseEventHandler;
import com.logistics.pvis.gui.guilayer.GuiLayer;
import com.logistics.pvis.gui.guilayer.GuiLayerFactory;
import com.logistics.pvis.scene.BaseScene;
import com.logistics.pvis.scene.BaseSceneFactory;
import com.logistics.pvis.scene.Scene;

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
		BaseSceneFactory factory = new BaseSceneFactory();
		Scene scene = factory.produceBaseScene();
		
		GuiLayerFactory guiLayerFactory = new GuiLayerFactory();
		GuiLayer layer = guiLayerFactory.produceGuiLayer(frame);
		
		scene.addLayer(layer);
		
		addButton(layer);
		
		frame.setCurrentScene(scene);
	}
	
	private void addButton(GuiLayer layer) {
		ButtonFactory buttonFactory = new ButtonFactory(layer, layer);
		Button button = buttonFactory.produceButton("123", 
				AnchorPoint.BottomRight, new Dimension(10, 20, 50, 20));
		DefaultButtonMouseEventHandler mouseHandler = 
				new DefaultButtonMouseEventHandler(button);
		button.addMouseEventHandler(mouseHandler);
		layer.addGuiElement(button);
	}
}
