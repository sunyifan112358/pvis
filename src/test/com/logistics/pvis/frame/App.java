package com.logistics.pvis.frame;

import processing.core.PConstants;
import processing.core.PGraphics;

import com.logistics.pvis.application.Application;
import com.logistics.pvis.canvas.P2DCanvas;
import com.logistics.pvis.canvas.TwoDimensionCanvas;
import com.logistics.pvis.layer.Layer;
import com.logistics.pvis.layer.TwoDimensionLayerImpl;
import com.logistics.pvis.scene.BaseScene;
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
		Scene scene = new BaseScene();
		PGraphics raw = frame.createGraphics(frame.getWidth(), frame.getHeight(), 
				PConstants.P2D);
		TwoDimensionCanvas canvas = new P2DCanvas(raw);
		Layer layer = new TwoDimensionLayerImpl(frame, canvas);
		scene.addLayer(layer);
		
		frame.setCurrentScene(scene);
	}
}
