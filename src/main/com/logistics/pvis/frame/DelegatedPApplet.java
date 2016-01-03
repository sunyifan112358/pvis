package com.logistics.pvis.frame;

import com.logistics.pvis.application.Application;
import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.scene.Scene;

import processing.core.PApplet;

public class DelegatedPApplet extends PApplet {

	private static final long serialVersionUID = 7918995274296560761L;
	
	Application application;
	
	Scene scene;

	/**
	 * @param application
	 */
	public DelegatedPApplet() {
		super();
	}
	
	/**
	 * @param application the application to set
	 */
	public void setApplication(Application application) {
		this.application = application;
	}

	/*
	 * (non-Javadoc)
	 * @see processing.core.PApplet#draw()
	 */
	@Override
	public void draw() {
		background(255);
		this.scene.render();
	}

	/**
	 * @param scene the scene to set
	 */
	public void setScene(Scene scene) {
		this.scene = scene;
	}
	
	/*
	 * (non-Javadoc)
	 * @see processing.core.PApplet#setup()
	 */
	@Override
	public void setup() {
		size(width, height, P2D);
		frameRate(60);
		
		application.start();
	}
	
	protected void processMouseEvent(processing.event.MouseEvent e) {
		MouseEvent event = new MouseEvent(e);
		scene.processMouseEvent(event);
	}
	
	/*
	 * (non-Javadoc)
	 * @see processing.core.PApplet#mouseClicked(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseClicked(processing.event.MouseEvent e) {
		processMouseEvent(e);
	}
	
	/*
	 * (non-Javadoc)
	 * @see processing.core.PApplet#mousePressed(java.awt.event.MouseEvent)
	 */
	@Override
	public void mousePressed(processing.event.MouseEvent e) {
		processMouseEvent(e);
	}
	
	/*
	 * (non-Javadoc)
	 * @see processing.core.PApplet#mouseDragged(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseDragged(processing.event.MouseEvent e) {
		processMouseEvent(e);
	}
	
	/*
	 * (non-Javadoc)
	 * @see processing.core.PApplet#mouseReleased(java.awt.event.MouseEvent)
	 */
	@Override
	public void mouseReleased(processing.event.MouseEvent e) {
		processMouseEvent(e);
	}
	
	/*
	 * (non-Javadoc)
	 * @see processing.core.PApplet#mouseWheel(processing.event.MouseEvent)
	 */
	@Override
	public void mouseWheel(processing.event.MouseEvent e) {
		processMouseEvent(e);
	}
	
}
