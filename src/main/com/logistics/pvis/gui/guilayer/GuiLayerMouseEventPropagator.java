package com.logistics.pvis.gui.guilayer;

import java.util.Iterator;
import java.util.Set;

import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.event.mouseevent.MouseEventHandler;
import com.logistics.pvis.gui.guielement.GuiElement;

public class GuiLayerMouseEventPropagator implements MouseEventHandler {
	
	GuiLayer layer;
	
	public GuiLayerMouseEventPropagator(GuiLayer layer) {
		this.layer = layer;
	}

	@Override
	public void process(MouseEvent mouseEvent) {
		Set<GuiElement> guiElements = layer.getGuiElements();
		synchronized(guiElements) {
			Iterator<GuiElement> it = guiElements.iterator();
			while(it.hasNext() && mouseEvent.isPropagating()) {
				GuiElement element = it.next();
				element.processMouseEvent(mouseEvent);
			}
		}
	}

}
