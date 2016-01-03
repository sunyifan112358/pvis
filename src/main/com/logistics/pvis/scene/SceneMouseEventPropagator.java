package com.logistics.pvis.scene;

import java.util.Iterator;
import java.util.List;

import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.event.mouseevent.MouseEventHandler;
import com.logistics.pvis.layer.Layer;

public class SceneMouseEventPropagator implements MouseEventHandler {
	
	Scene scene;
	
	public SceneMouseEventPropagator(Scene scene) {
		this.scene = scene;
	}

	@Override
	public void process(MouseEvent mouseEvent) {
		List<Layer> layers = scene.getLayers();
		synchronized(layers) {
			Iterator<Layer> it = layers.iterator();
			while(it.hasNext() && mouseEvent.isPropagating()) {
				Layer layer = it.next();
				layer.processMouseEvent(mouseEvent);
			}
		}
	}

}
