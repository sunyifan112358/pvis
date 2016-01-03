package com.logistics.pvis.gui.guielement.button;

import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.event.mouseevent.MouseEventAction;
import com.logistics.pvis.event.mouseevent.MouseEventHandler;

public class DefaultButtonMouseEventHandler implements MouseEventHandler {
	
	Button button;
	
	/**
	 * @param button
	 */
	public DefaultButtonMouseEventHandler(Button button) {
		super();
		this.button = button;
	}

	public boolean isMouseIn(MouseEvent mouseEvent) {
		double mouseX = mouseEvent.getPosition().getX();
		double mouseY = mouseEvent.getPosition().getY();
		Dimension dimension = 
				button.getGuiElementDimension().getAbsoluteDimension();
		if (mouseX > dimension.x && 
				mouseX < dimension.x + dimension.width &&
				mouseY > dimension.y && 
				mouseY < dimension.y + dimension.height) {
			return true;
		}
		return false;
	}

	@Override
	public void process(MouseEvent mouseEvent) {
		if (isMouseIn(mouseEvent)) {
			if(mouseEvent.getAction() == MouseEventAction.CLICK) {
				System.out.println("Clicked");
			}
		}
	}

}
