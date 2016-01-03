/**
 * Logistics server side
 */
package com.logistics.pvis.scene;

import java.util.List;

import com.logistics.pvis.event.mouseevent.MouseEventReceiver;
import com.logistics.pvis.layer.Layer;
import com.logistics.pvis.renderable.Renderable;

/**
 * @author Yifan
 *
 */
public interface Scene extends Renderable, MouseEventReceiver {
	public void addLayer(Layer layer);
	public List<Layer> getLayers();
}
