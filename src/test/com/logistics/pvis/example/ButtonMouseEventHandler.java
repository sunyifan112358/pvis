package com.logistics.pvis.example;

import com.logistics.pvis.event.mouseevent.MouseEvent;
import com.logistics.pvis.event.mouseevent.MouseEventAction;
import com.logistics.pvis.event.mouseevent.MouseEventHandler;

public class ButtonMouseEventHandler implements MouseEventHandler {

	@Override
	public void process(MouseEvent mouseEvent) {
		if(mouseEvent.getAction() == MouseEventAction.CLICK) {
			System.out.println("Clicked");
		}
	}

}
