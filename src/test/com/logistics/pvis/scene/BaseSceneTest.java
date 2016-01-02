package com.logistics.pvis.scene;

import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.logistics.pvis.event.mouseevent.GeneralMouseEventReceiverTest;
import com.logistics.pvis.layer.Layer;

public class BaseSceneTest {

	Layer layer1;
	Layer layer2;
	BaseScene scene;
	
	@Before
	public void setUp() throws Exception {
		layer1 = mock(Layer.class);
		layer2 = mock(Layer.class);
		
		scene = new BaseScene();
		scene.addLayer(layer1);
		scene.addLayer(layer2);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	public void assertAllLayersRendered() {
		verify(layer1).render();
		verify(layer2).render();
	}

	@Test
	public void testRender() {
		scene.render();
		assertAllLayersRendered();
	}

	@Test
	public void testProcessMouseEvent() {
		BaseScene scene = new BaseScene();
		GeneralMouseEventReceiverTest test = 
				new GeneralMouseEventReceiverTest(scene);
		test.testProcessMouseEvent();
	}

}
