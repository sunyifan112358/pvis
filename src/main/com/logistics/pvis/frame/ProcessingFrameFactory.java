package com.logistics.pvis.frame;

import javax.swing.JFrame;

public class ProcessingFrameFactory {
	
	private JFrameFactory jFrameFactory;
	private DelegatedPAppletFactory delegatedPAppletFactory;

	public ProcessingFrameFactory(JFrameFactory jFrameFactory, 
			DelegatedPAppletFactory delegatedPAppletFactory) {
		this.jFrameFactory = jFrameFactory;
		this.delegatedPAppletFactory = delegatedPAppletFactory;
	}
	
	public ProcessingFrame produceProcessingFrame(int width, int height) {
		JFrame javaFrame = jFrameFactory.produceJFrame();
		DelegatedPApplet pApplet = 
				delegatedPAppletFactory.produceDelegatedPApplet();
		ProcessingFrame frame = new ProcessingFrame(javaFrame, pApplet);
		
		frame.setWidth(width);
		frame.setHeight(height);
		
		return frame;
	}
	
}
