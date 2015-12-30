/**
 * Logistics server side
 */
package com.logistics.pvis.example;

import com.logistics.pvis.application.Application;
import com.logistics.pvis.frame.ProcessingFrame;
import com.logistics.pvis.frame.ProcessingFrameFactory;

/**
 * @author Yifan
 *
 */
public class ProcessingFrameTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProcessingFrameFactory frameFactory = new ProcessingFrameFactory();		
		ProcessingFrame frame =  frameFactory.produceProcessingFrame(960, 480);
		
		Application app = new App(frame);
		frame.setApplication(app);
		
		frame.show();
	}

}
