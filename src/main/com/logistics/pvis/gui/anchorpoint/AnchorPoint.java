/**
 * Logistics server side
 */
package com.logistics.pvis.gui.anchorpoint;

/**
 * @author Yifan
 *
 */
public enum AnchorPoint {
	TopLeft			(HorizontalAnchorPoint.Left, VerticalAnchorPoint.Top),
	TopCenter 		(HorizontalAnchorPoint.Center, VerticalAnchorPoint.Top),
	TopRight 		(HorizontalAnchorPoint.Right, VerticalAnchorPoint.Top),
	MiddleLeft 		(HorizontalAnchorPoint.Left, VerticalAnchorPoint.Middle),
	MiddleCenter 	(HorizontalAnchorPoint.Center, VerticalAnchorPoint.Middle),
	MiddleRight 	(HorizontalAnchorPoint.Right, VerticalAnchorPoint.Middle),
	BottomLeft 		(HorizontalAnchorPoint.Left, VerticalAnchorPoint.Bottom),
	BottomCenter 	(HorizontalAnchorPoint.Center, VerticalAnchorPoint.Bottom),
	BottomRight 	(HorizontalAnchorPoint.Right, VerticalAnchorPoint.Bottom);
	
	private final HorizontalAnchorPoint horizontal;
	private final VerticalAnchorPoint vertical;
	
	AnchorPoint(HorizontalAnchorPoint horizontal, 
			VerticalAnchorPoint vertical) {
		this.horizontal = horizontal;
		this.vertical = vertical;
	}

	/**
	 * @return the horizontal
	 */
	public HorizontalAnchorPoint getHorizontal() {
		return horizontal;
	}

	/**
	 * @return the vertical
	 */
	public VerticalAnchorPoint getVertical() {
		return vertical;
	}
	
	
}
