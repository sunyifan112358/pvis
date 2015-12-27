/**
 * Logistics server side
 */
package com.logistics.pvis.gui.guielement;

/**
 * @author Yifan
 *
 */
public class GuiElementDimensionImpl implements GuiElementDimension {

	private AnchorPoint anchorPoint;
	private int relativeX;
	private int relativeY;
	private int width;
	private int height;
	private int absoluteX;
	private int absoluteY;
	private GuiElementDimension containerDimension;

	/* (non-Javadoc)
	 * @see com.logistics.pvis.gui.guielement.GuiElementDimension#setAnchorPoint(com.logistics.pvis.gui.guielement.AnchorPoint)
	 */
	@Override
	public void setAnchorPoint(AnchorPoint anchorPoint) {
		this.anchorPoint = anchorPoint;
	}

	/* (non-Javadoc)
	 * @see com.logistics.pvis.gui.guielement.GuiElementDimension#setRelativeX(int)
	 */
	@Override
	public void setRelativeX(int x) {
		this.relativeX = x;
		updateAbsolutePosition();
	}

	/* (non-Javadoc)
	 * @see com.logistics.pvis.gui.guielement.GuiElementDimension#setRelativeY(int)
	 */
	@Override
	public void setRelativeY(int y) {
		this.relativeY = y;
		updateAbsolutePosition();
	}

	/* (non-Javadoc)
	 * @see com.logistics.pvis.gui.guielement.GuiElementDimension#setWidth(int)
	 */
	@Override
	public void setWidth(int width) {
		this.width = width;
		updateAbsolutePosition();
	}

	/* (non-Javadoc)
	 * @see com.logistics.pvis.gui.guielement.GuiElementDimension#setHeight(int)
	 */
	@Override
	public void setHeight(int height) {
		this.height = height;
		updateAbsolutePosition();
	}

	/* (non-Javadoc)
	 * @see com.logistics.pvis.gui.guielement.GuiElementDimension#getAbsoluteX()
	 */
	@Override
	public int getAbsoluteX() {
		return absoluteX;
	}

	/* (non-Javadoc)
	 * @see com.logistics.pvis.gui.guielement.GuiElementDimension#getAbsoluteY()
	 */
	@Override
	public int getAbsoluteY() {
		return absoluteY;
	}

	/* (non-Javadoc)
	 * @see com.logistics.pvis.gui.guielement.GuiElementDimension#setContainerDimension(com.logistics.pvis.gui.guielement.GuiElementDimension)
	 */
	@Override
	public void setContainerDimension(GuiElementDimension containerDimension) {
		this.containerDimension = containerDimension;
		updateAbsolutePosition();
	}
	
	private void updateAbsolutePosition() {
		
	}

}
