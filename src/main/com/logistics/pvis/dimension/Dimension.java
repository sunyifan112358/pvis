package com.logistics.pvis.dimension;

/**
 * A dimension represents the location and the size of an element
 * 
 * @author Yifan
 *
 */
public class Dimension {
	public double x;
	public double y;
	public double width;
	public double height;
	
	/**
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public Dimension(double x, double y, double width, double height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
}
