/**
 * Logistics server side
 */
package com.logistics.pvis.frame;

import com.logistics.pvis.application.Application;
import com.logistics.pvis.frame.ProcessingFrame;

/**
 * @author Yifan
 *
 */
public class ProcessingFrameTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ProcessingFrame frame =  new ProcessingFrame();
		
		Application app = new App(frame);
		frame.setApplication(app);
		
		frame.setWidth(960);
		frame.setHeight(480);
		frame.show();
		
	}

}
