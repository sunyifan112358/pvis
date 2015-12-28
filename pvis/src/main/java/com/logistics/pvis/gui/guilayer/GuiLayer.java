package com.logistics.pvis.gui.guilayer;

import java.util.ArrayList;
import java.util.List;

import processing.core.PGraphics;

import com.logistics.pvis.frame.Frame;
import com.logistics.pvis.gui.guicontainer.GuiContainer;
import com.logistics.pvis.gui.guielement.GuiElement;
import com.logistics.pvis.layer.Layer;
import com.logistics.pvis.layer.TwoDimensionLayer;

public class GuiLayer extends TwoDimensionLayer implements GuiContainer {
	
	List<GuiElement> elements = new ArrayList<GuiElement>();
	
	public GuiLayer(Frame frame, PGraphics canvas) {
		super(frame, canvas);
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
