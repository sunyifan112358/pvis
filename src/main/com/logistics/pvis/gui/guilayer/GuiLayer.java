package com.logistics.pvis.gui.guilayer;

import java.util.ArrayList;
import java.util.List;

import com.logistics.pvis.canvas.Canvas;
import com.logistics.pvis.canvas.TwoDimensionCanvas;
import com.logistics.pvis.frame.Frame;
import com.logistics.pvis.frame.ProcessingFrame;
import com.logistics.pvis.gui.guicontainer.GuiContainer;
import com.logistics.pvis.gui.guielement.GuiElement;
import com.logistics.pvis.gui.guielement.GuiElementDimension;
import com.logistics.pvis.layer.TwoDimensionLayer;

public class GuiLayer implements GuiContainer, TwoDimensionLayer {
	
	List<GuiElement> elements = new ArrayList<GuiElement>();
	TwoDimensionCanvas canvas;
	GuiElementDimension dimension;
	
	public GuiLayer(TwoDimensionCanvas canvas, 
			GuiElementDimension dimension) {
		this.canvas = canvas;
		this.dimension = dimension;
	}

	@Override
	public void render() {
		canvas.begin();
		synchronized (elements) {
			for(GuiElement element : elements) {
				element.render();
			}
		}
		canvas.end();
		canvas.render();
	}
	
	/**
	 * Add a GuiElement to the layer
	 * @param element
	 */
	public void addGuiElement(GuiElement element) {
		synchronized (elements) {
			elements.add(element);
		}
	}

	@Override
	public GuiElementDimension getContainerDimension() {
		return dimension;
	}

	@Override
	public TwoDimensionCanvas getCanvas() {
		return canvas;
	}

}
