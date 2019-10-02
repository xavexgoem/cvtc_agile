package org.cvtc.shapes.test;

import static org.junit.Assert.assertEquals;

import org.cvtc.shapes.Cuboid;
import org.cvtc.shapes.Dialog;
import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class SphereTest {
	
	Dialog messageBox = new MessageBoxSub();
	Sphere shape = new Sphere(messageBox, 1);

	@Test
	public void testConstructor() {
		Cuboid cube = new Cuboid(messageBox, 1, 1, 1);
		assert(cube instanceof Cuboid);
	}
	
	@Test
	public void testGetRadius() {
		assertEquals(1.0, shape.getRadius(), 0.0);
	}
	
	@Test
	public void testSurfaceArea() {
		assertEquals(12.567, shape.surfaceArea(), 0.01);
	}
	
	@Test
	public void testVolume() {
		assertEquals(4.189, shape.volume(), 0.01);
	}
	
	@Test
	public void testRender() {
		shape.render();
	}
}
