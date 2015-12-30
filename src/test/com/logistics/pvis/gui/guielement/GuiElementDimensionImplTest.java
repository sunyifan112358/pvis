/**
 * Logistics server side
 */
package com.logistics.pvis.gui.guielement;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Yifan
 *
 */
public class GuiElementDimensionImplTest {
	
	GuiElementDimension containerDimension;
	GuiElementDimension dimension;
	
	@Before
	public void setUp() {
		GuiElementDimension containerDimension = 
				mock(GuiElementDimension.class);
		when(containerDimension.getAbsoluteX()).thenReturn(100);
		when(containerDimension.getAbsoluteY()).thenReturn(200);
		when(containerDimension.getWidth()).thenReturn(1000);
		when(containerDimension.getHeight()).thenReturn(800);
		
		dimension = new GuiElementDimensionImpl();
		dimension.setContainerDimension(containerDimension);
		dimension.setRelativeX(10);
		dimension.setRelativeY(20);
		dimension.setWidth(30);
		dimension.setHeight(40);
	}

	@Test
	public void testGetAbsoluteDimensionTopLeft() {
		dimension.setAnchorPoint(AnchorPoint.TopLeft);
		assertEquals(110, dimension.getAbsoluteX());
		assertEquals(220, dimension.getAbsoluteY());
	}
	
	@Test
	public void testGetAbsoluteDimensionMiddleCenter() {
		dimension.setAnchorPoint(AnchorPoint.MiddleCenter);
		assertEquals(595, dimension.getAbsoluteX());
		assertEquals(600, dimension.getAbsoluteY());
	}
	
	@Test
	public void testGetAbsoluteDimensionBottomRight() {
		dimension.setAnchorPoint(AnchorPoint.BottomRight);
		assertEquals(1060, dimension.getAbsoluteX());
		assertEquals(940, dimension.getAbsoluteY());
	}
	
	@Test
	public void testGetAbsoluteDimensionRootContainer() {
		dimension.setContainerDimension(null);
		dimension.setAnchorPoint(AnchorPoint.BottomRight);
		assertEquals(10, dimension.getAbsoluteX());
		assertEquals(20, dimension.getAbsoluteY());
	}


}
