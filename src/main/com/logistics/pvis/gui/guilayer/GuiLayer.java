package com.logistics.pvis.gui.guilayer;

import java.util.ArrayList;
import java.util.List;

import com.logistics.pvis.canvas.TwoDimensionCanvas;
import com.logistics.pvis.frame.Frame;
import com.logistics.pvis.gui.guicontainer.GuiContainer;
import com.logistics.pvis.gui.guielement.GuiElement;
import com.logistics.pvis.layer.TwoDimensionLayer;
import com.logistics.pvis.layer.TwoDimensionLayerImpl;

public class GuiLayer implements GuiContainer, TwoDimensionLayer {
	
	List<GuiElement> elements = new ArrayList<GuiElement>();
	Frame frame;
	TwoDimensionCanvas canvas;
	
	public GuiLayer(Frame frame, TwoDimensionCanvas canvas) {
		this.frame = frame;
		this.canvas = canvas
	}

	@Override
	public void render() {
		synchronized (elements) {
			for(GuiElement element : elements) {
				element.render();
			}
		}
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

}
