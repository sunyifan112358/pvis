package com.logistics.pvis.event.mouseevent;

import java.util.ArrayList;
import java.util.List;

public class BasicMouseEventReceiver implements MouseEventReceiver {
	
	List<MouseEventHandler> eventHandlers = new ArrayList<MouseEventHandler>();

	@Override
	public void processMouseEvent(MouseEvent event) {
		synchronized(eventHandlers) {
			for (MouseEventHandler handler : eventHandlers) {
				handler.process(event);
			}
		}
	}

	@Override
	public void addMouseEventHandler(MouseEventHandler eventHandler) {
		synchronized(eventHandlers) {
			this.eventHandlers.add(eventHandler);
		}
	}

}
