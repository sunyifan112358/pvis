/**
 * Logistics server side
 */
package com.logistics.pvis.scene;

import com.logistics.pvis.event.keyevent.KeyEvent;
import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.event.mouseevent.MouseEventReceiver;
import com.logistics.pvis.layer.Layer;
import com.logistics.pvis.renderable.Renderable;

/**
 * @author Yifan
 *
 */
public interface Scene extends Renderable, MouseEventReceiver {
	void addLayer(Layer layer);
}
