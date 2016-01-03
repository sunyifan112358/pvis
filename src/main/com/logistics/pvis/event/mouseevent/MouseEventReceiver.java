package com.logistics.pvis.event.mouseevent;


public interface MouseEventReceiver {
	public void processMouseEvent(MouseEvent event);
	public void addMouseEventHandler(MouseEventHandler eventHandler);
}
