package com.logistics.pvis.gui.guielement.button;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.logistics.pvis.gui.guielement.GuiElementDimension;
import com.logistics.pvis.gui.guilayer.GuiLayer;
import com.logistics.pvis.shape.Shape;
import com.logistics.pvis.shape.text.Text;

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
		Shape shape = mock(Shape.class);
		Text text = mock(Text.class);
		
		Button button = new Button(null);
		button.setShape(shape);
		button.setText(text);
		button.render();
		
		verify(shape).render();
		verify(text).render();
		
	}

}
