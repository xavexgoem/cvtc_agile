package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.cvtc.shapes.Dialog;
import org.junit.Test;

public class CylinderTest {
	
	Dialog messageBox = new MessageBoxSub();
	Cylinder shape = new Cylinder(messageBox, 1,1);

	@Test
	public void testConstructor() {
		Cylinder cube = new Cylinder(messageBox,1, 1);
		assert(cube instanceof Cylinder);
	}
	
	@Test
	public void testGetRadius() {
		assertEquals(1.0, shape.getRadius(), 0.0);
	}
	
	@Test
	public void testGetHeight() {
		assertEquals(1.0, shape.getHeight(), 0.0);
	}
	
	@Test
	public void testSurfaceArea() {
		assertEquals(12.566, shape.surfaceArea(), 0.01);
	}
	
	@Test
	public void testVolume() {
		assertEquals(3.141, shape.volume(), 0.01);
	}
	
	@Test
	public void testRender() {
		shape.render();
	}

}
