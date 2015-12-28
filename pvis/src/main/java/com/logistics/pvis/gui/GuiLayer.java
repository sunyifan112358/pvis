package com.logistics.pvis.gui;

import java.util.ArrayList;
import java.util.List;

import com.logistics.pvis.gui.guicontainer.GuiContainer;
import com.logistics.pvis.gui.guielement.GuiElement;
import com.logistics.pvis.layer.Layer;

public class GuiLayer implements Layer, GuiContainer {
	
	List<GuiElement> elements = new ArrayList<GuiElement>();

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
