package com.logistics.pvis.scene;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.layer.Layer;

public class SceneMouseEventPropagatorTest {
	
	List<Layer> layers;
	Layer layer1;
	Layer layer2;
	Scene scene;
	MouseEvent event;

	@Before
	public void setUp() throws Exception {
		layers = new ArrayList<Layer>();
		layer1 = mock(Layer.class);
		layer2 = mock(Layer.class);
		layers.add(layer1);
		layers.add(layer2);
		
		scene = mock(Scene.class);
		when(scene.getLayers()).thenReturn(layers);
		
		event = mock(MouseEvent.class);
		when(event.isPropagating()).thenReturn(true);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProcessShouldPropagateToAllLayers() {
		SceneMouseEventPropagator propagator = 
				new SceneMouseEventPropagator(scene);
		
		propagator.process(event);
		
		verify(layer1).processMouseEvent(event);
		verify(layer2).processMouseEvent(event);
	}
	
	@Test
	public void testProcessShouldStopPropagating() {
		when(event.isPropagating())
			.thenReturn(true)
			.thenReturn(false);
		
		SceneMouseEventPropagator propagator = 
				new SceneMouseEventPropagator(scene);
		
		propagator.process(event);
		
		verify(layer1).processMouseEvent(event);
		verify(layer2, never()).processMouseEvent(event);
	}

}
