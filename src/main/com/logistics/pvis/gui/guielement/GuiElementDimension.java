/**
 * Logistics server side
 */
package com.logistics.pvis.gui.guielement;

import com.logistics.pvis.gui.anchorpoint.AnchorPoint;

/**
 * @author Yifan
 *
 */
public interface GuiElementDimension {
	void setAnchorPoint(AnchorPoint anchorPoint);
	AnchorPoint getAnchorPoint();
	void setRelativeX(int x);
	void setRelativeY(int y);
	void setWidth(int width);
	void setHeight(int height);
	void setContainerDimension(GuiElementDimension containerDimension);
	GuiElementDimension getContainerDimension();
	int getAbsoluteX();
	int getAbsoluteY();
	int getWidth();
	int getHeight();
}
