package com.logistics.pvis.scene;

public class BaseSceneFactory {
	
	public BaseScene produceBaseScene() {
		BaseScene scene = new BaseScene();
		
		SceneMouseEventPropagator propagator = 
				new SceneMouseEventPropagator(scene);
		scene.addMouseEventHandler(propagator);
		
		return scene;
	}
	
}
