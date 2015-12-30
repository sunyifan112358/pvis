/**
 * Logistics server side
 */
package com.logistics.pvis.frame;

import com.logistics.pvis.application.Application;
import com.logistics.pvis.canvas.Canvas;
import com.logistics.pvis.scene.Scene;

/**
 * A Frame is the window to be present
 * 
 * @author Yifan
 *
 */
public interface Frame {
	
	/**
	 * Width of the window
	 * @return
	 */
	int getWidth();
	
	/**
	 * Set width of the window
	 * @param width
	 */
	void setWidth(int width);
	
	/**
	 * Height of the window
	 * @return
	 */
	int getHeight();
	
	/**
	 * Set height of the frame
	 * @param height
	 */
	void setHeight(int height);
	
	/**
	 * Change the showing scene to a new one
	 * @param scene The scene to be shown
	 */
	void setCurrentScene(Scene scene);
	
	/**
	 * Show the frame
	 */
	public void show();
	
	/**
	 * Set the application to run
	 * @param application 
	 */
	public void setApplication(Application application);
}
