package com.logistics.pvis.gui.guilayer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.logistics.pvis.canvas.TwoDimensionCanvas;
import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.event.mouseevent.MouseEventHandler;
import com.logistics.pvis.gui.guicontainer.GuiContainer;
import com.logistics.pvis.gui.guielement.GuiElement;
import com.logistics.pvis.gui.guielement.GuiElementDimension;
import com.logistics.pvis.layer.TwoDimensionLayer;

public class GuiLayer implements GuiContainer, TwoDimensionLayer {
	
	Set<GuiElement> elements = new HashSet<GuiElement>();
	List<MouseEventHandler> mouseEventHandlers = 
			new ArrayList<MouseEventHandler>();
	TwoDimensionCanvas canvas;
	GuiElementDimension dimension;
	
	public GuiLayer(TwoDimensionCanvas canvas, 
			GuiElementDimension dimension) {
		this.canvas = canvas;
		this.dimension = dimension;
	}

	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.renderable.Renderable#render()
	 */
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
	
	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.gui.guicontainer.GuiContainer#addGuiElement(com.logistics.pvis.gui.guielement.GuiElement)
	 */
	@Override
	public void addGuiElement(GuiElement element) {
		synchronized (elements) {
			elements.add(element);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.gui.guicontainer.GuiContainer#getContainerDimension()
	 */
	@Override
	public GuiElementDimension getContainerDimension() {
		return dimension;
	}

	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.layer.Layer#getCanvas()
	 */
	@Override
	public TwoDimensionCanvas getCanvas() {
		return canvas;
	}

	@Override
	public void processMouseEvent(MouseEvent event) {
		synchronized(mouseEventHandlers) {
			Iterator<MouseEventHandler> it = mouseEventHandlers.iterator();
			while(it.hasNext()) {
				MouseEventHandler handler = it.next();
				handler.process(event);
			}
		}
	}

	@Override
	public void addMouseEventHandler(MouseEventHandler eventHandler) {
		synchronized(mouseEventHandlers) {
			mouseEventHandlers.add(eventHandler);
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.gui.guicontainer.GuiContainer#getGuiElement()
	 */
	@Override
	public Set<GuiElement> getGuiElements() {
		return this.elements;
	}
	
}
