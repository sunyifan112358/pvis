package com.logistics.pvis.element;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.event.mouseevent.MouseEventHandler;

public abstract class BaseElement implements Element {
	
	public List<MouseEventHandler> mouseEventHandlers;
	
	public BaseElement() {
		mouseEventHandlers = new ArrayList<MouseEventHandler>();
	}

	@Override
	public void processMouseEvent(MouseEvent event) {
		synchronized(mouseEventHandlers) {
			Iterator<MouseEventHandler> it = mouseEventHandlers.iterator();
			while(it.hasNext()) {
				MouseEventHandler handler = it.next();
				handler.process(event);
			}
		}
	}

	@Override
	public void addMouseEventHandler(MouseEventHandler eventHandler) {
		synchronized(mouseEventHandlers) {
			mouseEventHandlers.add(eventHandler);
		}
	}

}
