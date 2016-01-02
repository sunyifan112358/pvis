/**
 * Logistics server side
 */
package com.logistics.pvis.gui.guicontainer;

import java.util.Set;

import com.logistics.pvis.gui.guielement.GuiElement;
import com.logistics.pvis.gui.guielement.GuiElementDimension;

/**
 * @author Yifan
 *
 */
public interface GuiContainer {
	public GuiElementDimension getContainerDimension();
	public void addGuiElement(GuiElement element);
	public Set<GuiElement> getGuiElements();
}
