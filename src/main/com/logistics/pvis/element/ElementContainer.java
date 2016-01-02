package com.logistics.pvis.element;

import java.util.Set;

public interface ElementContainer {
	public Set<Element> getElements();
	public void addElement(Element element);
}
