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
	
	public static final Color WHITE = new Color(255);
	public static final Color BLACK = new Color(0);
	
	public boolean equals(Color color) {
		if (r == color.r && g == color.g && b == color.b && a == color.a) {
			return true;
		}
		return false;
	}
}
