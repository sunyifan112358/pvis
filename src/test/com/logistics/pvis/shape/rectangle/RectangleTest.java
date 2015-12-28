package com.logistics.pvis.shape.rectangle;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.logistics.pvis.dimension.Dimension;
import com.logistics.pvis.layer.TwoDimensionLayer;

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
		dimension.x = 10; 
		dimension.y = 20;
		dimension.width = 30;
		dimension.height = 40;
		
		TwoDimensionLayer layer = mock(TwoDimensionLayer.class);
		
		Rectangle rectangle = new Rectangle(layer);
		rectangle.setDimension(dimension);
		rectangle.render();
		
		verify(layer).rectangle(10, 20, 30, 40);
	}

}
