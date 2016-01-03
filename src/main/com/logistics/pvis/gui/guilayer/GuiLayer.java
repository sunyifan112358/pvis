package com.logistics.pvis.gui.guilayer;

import java.util.HashSet;
import java.util.Set;

import com.logistics.pvis.canvas.TwoDimensionCanvas;
import com.logistics.pvis.element.BaseElement;
import com.logistics.pvis.gui.guicontainer.GuiContainer;
import com.logistics.pvis.gui.guielement.GuiElement;
import com.logistics.pvis.gui.guielement.GuiElementDimension;
import com.logistics.pvis.layer.TwoDimensionLayer;

public class GuiLayer extends BaseElement implements GuiContainer, TwoDimensionLayer {
	
	Set<GuiElement> elements = new HashSet<GuiElement>();
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

	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.gui.guicontainer.GuiContainer#getGuiElement()
	 */
	@Override
	public Set<GuiElement> getGuiElements() {
		return this.elements;
	}
	
}
