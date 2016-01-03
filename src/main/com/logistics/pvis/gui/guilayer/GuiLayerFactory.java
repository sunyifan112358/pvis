package com.logistics.pvis.gui.guilayer;

import com.logistics.pvis.canvas.P2DCanvas;
import com.logistics.pvis.frame.ProcessingFrame;
import com.logistics.pvis.gui.guielement.GuiElementDimension;
import com.logistics.pvis.gui.guielement.GuiElementDimensionImpl;

public class GuiLayerFactory {
	
	public GuiLayer produceGuiLayer(ProcessingFrame frame) {
		P2DCanvas canvas = createCanvas(frame);
		GuiElementDimension dimension = createGuiElementDimension(frame);
		
		GuiLayer layer = new GuiLayer(canvas, dimension);
		
		GuiLayerMouseEventPropagator propagator = 
				createGuiLayerMouseEventPropagator(layer);
		layer.addMouseEventHandler(propagator);
		
		return layer;
	}
	
	protected GuiLayerMouseEventPropagator createGuiLayerMouseEventPropagator(
			GuiLayer layer) {
		return new GuiLayerMouseEventPropagator(layer);
	}
	
	protected GuiElementDimension createGuiElementDimension(
			ProcessingFrame frame) {
		GuiElementDimension dimension = new GuiElementDimensionImpl(); 
		dimension.setRelativeX(0);
		dimension.setRelativeY(0);
		dimension.setWidth(frame.getWidth());
		dimension.setHeight(frame.getHeight());
		return dimension;
	}

	private P2DCanvas createCanvas(ProcessingFrame frame) {
		P2DCanvas canvas = frame.createP2DCanvas();
		return canvas;
	}
}
