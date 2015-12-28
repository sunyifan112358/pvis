package com.logistics.pvis.gui.guielement.button;

import com.logistics.pvis.gui.guielement.GuiElement;
import com.logistics.pvis.gui.guielement.GuiElementDimension;
import com.logistics.pvis.gui.guilayer.GuiLayer;
import com.logistics.pvis.layer.Layer;

public class Button implements GuiElement {

	GuiLayer layer = null;
	GuiElementDimension dimension = null;
			
	
	/**
	 * @param layer
	 */
	public Button(GuiLayer layer, GuiElementDimension dimension) {
		super();
		this.layer = layer;
		this.dimension = dimension;
	}


	@Override
	public void render() {
		layer.rectangle(dimension.getAbsoluteX(), dimension.getAbsoluteY(),
				dimension.getWidth(), dimension.getHeight());
	}

}
