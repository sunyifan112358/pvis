package com.logistics.pvis.scene;

import java.util.ArrayList;
import java.util.List;

import com.logistics.pvis.element.BaseElement;
import com.logistics.pvis.layer.Layer;

public class BaseScene extends BaseElement implements Scene {
	
	List<Layer> layers = new ArrayList<Layer>();

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
	public List<Layer> getLayers() {
		return layers;
	}

}
