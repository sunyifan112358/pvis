/**
 * Logistics server side
 */
package com.logistics.pvis.scene;

import com.logistics.pvis.layer.Layer;
import com.logistics.pvis.renderable.Renderable;

/**
 * @author Yifan
 *
 */
public interface Scene extends Renderable {
	void addLayer(Layer layer);
}
