package com.logistics.pvis.frame;

import javax.swing.JFrame;

public class ProcessingFrameFactory {
	
	public ProcessingFrame produceProcessingFrame(int width, int height) {
		JFrame javaFrame = new JFrame();
		DelegatedPApplet pApplet = new DelegatedPApplet();
		ProcessingFrame frame = new ProcessingFrame(javaFrame, pApplet);
		
		frame.setWidth(width);
		frame.setHeight(height);
		
		return frame;
	}
	
}
