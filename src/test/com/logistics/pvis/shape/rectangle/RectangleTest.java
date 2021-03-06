package com.logistics.pvis.shape.rectangle;

import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.logistics.pvis.canvas.TwoDimensionCanvas;
import com.logistics.pvis.color.Color;
import com.logistics.pvis.dimension.Dimension;

public class RectangleTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRender() {
		Dimension dimension = mock(Dimension.class);
		TwoDimensionCanvas canvas = mock(TwoDimensionCanvas.class);
		
		Rectangle rectangle = new Rectangle(canvas);
		rectangle.setDimension(dimension);
		Color color = new Color(1, 2, 3, 4);
		rectangle.setEdgeColor(color);
		rectangle.setFillColor(color);
		rectangle.render();
		
		verify(canvas).setFillColor(color);
		verify(canvas).setStrokeColor(color);
		verify(canvas).rectangle(dimension);
	}

}
