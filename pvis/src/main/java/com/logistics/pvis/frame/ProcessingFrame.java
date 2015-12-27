/**
 * Logistics server side
 */
package com.logistics.pvis.frame;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.logistics.pvis.scene.Scene;

import processing.core.PApplet;

/**
 * @author Yifan
 *
 */
public class ProcessingFrame extends PApplet implements Frame {
	
	private static final long serialVersionUID = 6443700965298413664L;
	
	private JFrame javaFrame;
	
	private int width;
	private int height;

	/* (non-Javadoc)
	 * @see com.logistics.pvis.frame.Frame#getWidth()
	 */
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
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
	 * @see com.logistics.pvis.frame.Frame#getHeight()
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.frame.Frame#setHeight(int)
	 */
	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	/* (non-Javadoc)
	 * @see com.logistics.pvis.frame.Frame#show()
	 */
	@Override
	public void show() {
		javaFrame = new JFrame();
		javaFrame.getContentPane().setPreferredSize(
				new Dimension(width, height));
		javaFrame.pack();
		javaFrame.add(this);
		
		this.init();
		
		javaFrame.setVisible(true);
	}
	
	/*
	 * (non-Javadoc)
	 * @see processing.core.PApplet#setup()
	 */
	public void setup() {
		size(width, height, P2D);
		frameRate(60);
	}

	/*
	 * (non-Javadoc)
	 * @see com.logistics.pvis.frame.Frame#setCurrentScene(com.logistics.pvis.scene.Scene)
	 */
	@Override
	public void setCurrentScene(Scene scene) {
		// TODO Auto-generated method stub
		
	}


}
