package com.logistics.pvis.shape.text;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.logistics.pvis.canvas.TwoDimensionCanvas;
import com.logistics.pvis.color.Color;
import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.shape.text.Text;

public class TextTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRender() {
		TwoDimensionCanvas canvas = mock(TwoDimensionCanvas.class);
		Dimension dimension = mock(Dimension.class);
		
		Text text = new Text(canvas);
		text.setText("abcde");
		text.setDimension(dimension);
		Color color = new Color(1, 2, 3, 4);
		text.setEdgeColor(color);
		text.setFillColor(color);
		text.render();
		
		verify(canvas).setFillColor(color);
		verify(canvas).setStrokeColor(color);
		verify(canvas).text("abcde", dimension);
	}

}
