/**
 * Logistics server side
 */
package com.logistics.pvis.gui.guielement;

/**
 * @author Yifan
 *
 */
public interface GuiElementDimension {
	void setAnchorPoint(AnchorPoint anchorPoint);
	void setRelativeX(int x);
	void setRelativeY(int y);
	void setWidth(int width);
	void setHeight(int height);
	void setContainerDimension(GuiElementDimension containerDimension);
	int getAbsoluteX();
	int getAbsoluteY();
}
