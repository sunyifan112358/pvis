package com.logistics.pvis.event.mouseevent;

import processing.core.PConstants;

import com.logistics.pvis.event.Event;
import com.logistics.pvis.point.Point2D;

public class MouseEvent implements Event {
	
	MouseEventAction action;
	MouseButton button;
	Point2D position;
	int count;
	boolean isPropagating = true;
	
	protected MouseEventAction convertMouseAction(int action) 
			throws NotSupportedMouseAction {
		switch(action) {
		case processing.event.MouseEvent.PRESS:
			return MouseEventAction.PRESS;
			
		case processing.event.MouseEvent.RELEASE:
			return MouseEventAction.RELEASE;
			
		case processing.event.MouseEvent.DRAG:
			return MouseEventAction.DRAG;
			
		case processing.event.MouseEvent.CLICK:
			return MouseEventAction.CLICK;
			
		case processing.event.MouseEvent.WHEEL:
			return MouseEventAction.WHEEL;
			
		case processing.event.MouseEvent.MOVE:
			return MouseEventAction.MOVE;
		
		default:
			throw new NotSupportedMouseAction(
					String.format("Mouse action type: %d", action));
		}
	}
	
	protected MouseButton convertMouseButton(int button) {
		switch(button) {
		case PConstants.LEFT:
			return MouseButton.LEFT;
			
		case PConstants.RIGHT:
			return MouseButton.RIGHT;
			
		case PConstants.CENTER:
			return MouseButton.MIDDLE;
			
		default:
			return MouseButton.NONE;
			
		}
	}
	
	public MouseEvent(processing.event.MouseEvent event) {
		try {
			this.action = convertMouseAction(event.getAction());
			this.button = convertMouseButton(event.getButton());
			this.position = new Point2D(event.getX(), event.getY());
			this.count = event.getCount();
		} catch (NotSupportedMouseAction e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public MouseButton getButton() {
		return this.button;
	}
	
	public Point2D getPosition() {
		return position;
	}
	
	public MouseEventAction getAction() {
		return action;
	}

	@Override
	public boolean isPropagating() {
		return this.isPropagating;
	}

	@Override
	public void stopPropagation() {
		this.isPropagating = false;
	}

}
