package com.logistics.pvis.gui.guilayer;

import com.logistics.pvis.canvas.P2DCanvas;
import com.logistics.pvis.canvas.P2DCanvasFactory;
import com.logistics.pvis.frame.ProcessingFrame;
import com.logistics.pvis.gui.guielement.GuiElementDimension;
import com.logistics.pvis.gui.guielement.GuiElementDimensionImpl;

public class GuiLayerFactory {
	
	P2DCanvasFactory canvasFactory;

	public GuiLayerFactory(P2DCanvasFactory canvasFactory) {
		this.canvasFactory = canvasFactory;
	}

	public GuiLayer produceGuiLayer(ProcessingFrame frame) {
		P2DCanvas canvas = canvasFactory.produceCanvas(frame);
		GuiElementDimension dimension = new GuiElementDimensionImpl(); 
		dimension.setRelativeX(0);
		dimension.setRelativeY(0);
		dimension.setWidth(frame.getWidth());
		dimension.setHeight(frame.getHeight());
		GuiLayer layer = new GuiLayer(canvas, dimension);
		return layer;
	}
}
