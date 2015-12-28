/**
 * Logistics server side
 */
package com.logistics.pvis.gui.guielement;

/**
 * @author Yifan
 *
 */
public class GuiElementDimensionImpl implements GuiElementDimension {

	private AnchorPoint anchorPoint = AnchorPoint.TopLeft;
	private int relativeX = 0;
	private int relativeY = 0;
	private int width = 0;
	private int height = 0;
	private int absoluteX = 0;
	private int absoluteY = 0;
	private GuiElementDimension containerDimension = null;

	/* (non-Javadoc)
	 * @see com.logistics.pvis.gui.guielement.GuiElementDimension#setAnchorPoint(com.logistics.pvis.gui.guielement.AnchorPoint)
	 */
	@Override
	public void setAnchorPoint(AnchorPoint anchorPoint) {
		this.anchorPoint = anchorPoint;
		updateAbsolutePosition();
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
		// Set absolute position on X axis
		switch (this.anchorPoint) {
		case TopLeft: 
		case MiddleLeft:
		case BottomLeft:
			this.absoluteX = this.relativeX + 
				containerDimension.getAbsoluteX(); 
			break;
			
		case TopCenter:
		case MiddleCenter:
		case BottomCenter:
			this.absoluteX = this.relativeX + 
				containerDimension.getAbsoluteX() + 
				containerDimension.getWidth() / 2 - 
				this.width / 2;
			break;
			
		case TopRight:
		case MiddleRight:
		case BottomRight:
			this.absoluteX = containerDimension.getAbsoluteX() + 
				containerDimension.getWidth() - 
				this.width - this.relativeX;
			break;
		}
		
		// Set absolute position on Y axis
		switch (this.anchorPoint) {
		case TopLeft:
		case TopCenter:
		case TopRight:
			absoluteY = relativeY + containerDimension.getAbsoluteY(); 
			break;
			
		case MiddleLeft:
		case MiddleCenter:
		case MiddleRight:
			absoluteY = relativeY + containerDimension.getAbsoluteY() + 
				containerDimension.getHeight() / 2 - this.height / 2;
			break;
			
		case BottomLeft:
		case BottomCenter:
		case BottomRight:
			absoluteY = containerDimension.getAbsoluteY() + 
				containerDimension.getHeight() - this.height - relativeY;
			break;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.gui.guielement.GuiElementDimension#getWidth()
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.gui.guielement.GuiElementDimension#getHeight()
	 */
	@Override
	public int getHeight() {
		return height;
	}

}
