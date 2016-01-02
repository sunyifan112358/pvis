package com.logistics.pvis.scene;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.event.mouseevent.MouseEventHandler;
import com.logistics.pvis.layer.Layer;

public class BaseScene implements Scene {
	
	List<Layer> layers = new ArrayList<Layer>();
	List<MouseEventHandler> mouseEventHandlers = 
			new ArrayList<MouseEventHandler>();

	@Override
	public void render() {
		synchronized(layers) {
			for (Layer layer : layers) {
				layer.render();
			}
		}
	}

	@Override
	public void addLayer(Layer layer) {
		synchronized(layers) {
			layers.add(layer);
		}
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
