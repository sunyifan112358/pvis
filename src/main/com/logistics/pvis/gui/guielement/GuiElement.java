/**
 * Logistics server side
 */
package com.logistics.pvis.gui.guielement;

import com.logistics.pvis.element.Element;
import com.logistics.pvis.renderable.Renderable;

/**
 * @author Yifan
 *
 */
public interface GuiElement extends Element, Renderable{
	public GuiElementDimension getGuiElementDimension();
}
