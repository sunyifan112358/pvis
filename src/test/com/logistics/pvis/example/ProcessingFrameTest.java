/**
 * Logistics server side
 */
package com.logistics.pvis.example;

import javax.swing.JFrame;

import com.logistics.pvis.application.Application;
import com.logistics.pvis.frame.DelegatedPApplet;
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
		JFrame javaFrame = new JFrame();
		Application app;
		DelegatedPApplet pApplet = new DelegatedPApplet();
		
		ProcessingFrame frame =  new ProcessingFrame(javaFrame, pApplet);
		
		app = new App(frame);
		frame.setApplication(app);
		
		frame.setWidth(960);
		frame.setHeight(480);
		frame.show();
		
	}

}
