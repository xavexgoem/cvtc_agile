package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Dialog;
import org.junit.Test;

public class CuboidTest {
	
	Dialog messageBox = new MessageBoxSub();
	Cuboid shape = new Cuboid(messageBox, 1,1,1);

	@Test
	public void testConstructor() {
		Cuboid cube = new Cuboid(messageBox, 1, 1, 1);
		assert(cube instanceof Cuboid);
	}
	
	@Test
	public void testGetWidth() {
		assertEquals(1.0, shape.getWidth(), 0.0);
	}
	
	@Test
	public void testGetHeight() {
		assertEquals(1.0, shape.getHeight(), 0.0);
	}
	
	@Test
	public void testGetDepth() {
		assertEquals(1.0, shape.getDepth(), 0.0);
	}
	
	@Test
	public void testSurfaceArea() {
		assertEquals(6.0, shape.surfaceArea(), 0.0);
	}
	
	@Test
	public void testVolume() {
		assertEquals(1.0, shape.volume(), 0.0);
	}
	
	@Test
	public void testRender() {
		shape.render();
	}

}
