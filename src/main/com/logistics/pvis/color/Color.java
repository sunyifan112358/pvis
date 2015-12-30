package com.logistics.pvis.color;

public class Color {
	public int r, g, b, a;
	
	public Color(int r, int g, int b, int a) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
	}
	
	public Color(int r, int g, int b) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = 255;
	}
	
	public Color(int grayScale) {
		this.r = grayScale;
		this.g = grayScale;
		this.b = grayScale;
		this.a = 255;
	}
}
