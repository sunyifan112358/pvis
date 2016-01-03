package com.logistics.pvis.scene;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BaseSceneFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProduceBaseScene() {
		BaseSceneFactory factory = new BaseSceneFactory();
		BaseScene scene = factory.produceBaseScene();
		
		assertTrue(scene.mouseEventHandlers.get(0) instanceof 
				SceneMouseEventPropagator);
	}

}
