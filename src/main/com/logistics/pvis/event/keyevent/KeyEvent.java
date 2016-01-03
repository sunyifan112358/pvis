package com.logistics.pvis.event.keyevent;

import com.logistics.pvis.event.Event;

public class KeyEvent implements Event {

	@Override
	public boolean isPropagating() {
		return false;
	}

	@Override
	public void stopPropagation() {
	}

}
