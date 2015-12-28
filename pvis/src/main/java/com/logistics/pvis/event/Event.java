package com.logistics.pvis.event;

public interface Event {
	boolean isPropagating();
	void stopPropagation();
}
