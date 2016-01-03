/**
 * Logistics server side
 */
package com.logistics.pvis.frame;

import java.awt.Dimension;

import javax.swing.JFrame;

import processing.core.PConstants;
import processing.core.PGraphics;

import com.logistics.pvis.application.Application;
import com.logistics.pvis.canvas.P2DCanvas;
import com.logistics.pvis.scene.Scene;

/**
 * @author Yifan
 *
 */
public class ProcessingFrame implements Frame {
	
	JFrame javaFrame;
	DelegatedPApplet delegatedPApplet;

	int width;
	int height;
	
	/**
	 * @param application the application to set
	 */
	public ProcessingFrame(JFrame javaFrame, DelegatedPApplet pApplet) {
		this.javaFrame = javaFrame;
		this.delegatedPApplet = pApplet;
	}
	
	/**
	 * @return the delegatedPApplet
	 */
	public DelegatedPApplet getDelegatedPApplet() {
		return delegatedPApplet;
	}

	/* (non-Javadoc)
	 * @see com.logistics.pvis.frame.Frame#getHeight()
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/* (non-Javadoc)
	 * @see com.logistics.pvis.frame.Frame#getWidth()
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.frame.Frame#setCurrentScene(com.logistics.pvis.scene.Scene)
	 */
	@Override
	public void setCurrentScene(Scene scene) {
		delegatedPApplet.setScene(scene);
	}

	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.frame.Frame#setHeight(int)
	 */
	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.frame.Frame#setWidth(int)
	 */
	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	/* (non-Javadoc)
	 * @see com.logistics.pvis.frame.Frame#show()
	 */
	@Override
	public void show() {
		javaFrame.getContentPane().setPreferredSize(
				new Dimension(width, height));
		javaFrame.pack();
		javaFrame.add(delegatedPApplet);
		delegatedPApplet.init();
		javaFrame.setVisible(true);
	}
	
	/**
	 * Render a canvas to the screen
	 * @param canvas The canvas to post
	 */
	public void postP2DCanvas(P2DCanvas canvas) {
		delegatedPApplet.image(canvas.getRaw(), 0, 0);
	}

	@Override
	public void setApplication(Application application) {
		delegatedPApplet.setApplication(application);
	}
	
	/**
	 * Create a P2D Canvas with the same size as the frame
	 * @return
	 */
	public P2DCanvas createP2DCanvas() {
		PGraphics pGraphics = delegatedPApplet.createGraphics(
				this.width, this.height, PConstants.P2D);
		P2DCanvas canvas = new P2DCanvas(pGraphics, this);
		return canvas;
	}
}
