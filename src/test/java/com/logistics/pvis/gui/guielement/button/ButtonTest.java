package com.logistics.pvis.gui.guielement.button;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.logistics.pvis.gui.guielement.GuiElementDimension;
import com.logistics.pvis.gui.guilayer.GuiLayer;

import static org.mockito.Mockito.*;


public class ButtonTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRender() {
		GuiElementDimension dimension = mock(GuiElementDimension.class);
		when(dimension.getAbsoluteX()).thenReturn(10);
		when(dimension.getAbsoluteY()).thenReturn(20);
		when(dimension.getWidth()).thenReturn(30);
		when(dimension.getHeight()).thenReturn(40);
		
		GuiLayer layer = mock(GuiLayer.class);
		
		Button button = new Button(layer, dimension);
		button.render();
		
		verify(layer).rectangle(10, 20, 30, 40);
		
		
	}

}
