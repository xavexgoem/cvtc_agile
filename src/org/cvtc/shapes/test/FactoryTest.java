package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.*;
import org.junit.Test;

public class FactoryTest {


	@Test
	public void testFactory() {
		Dialog mbox = new MessageBox();
		ShapeFactory factory = new ShapeFactory(mbox);
		Shape cuboid = factory.make(ShapeType.CUBOID);
		Shape cylinder = factory.make(ShapeType.CYLINDER);
		Shape sphere = factory.make(ShapeType.SPHERE);
		assert(cuboid instanceof Cuboid);
		assert(cylinder instanceof Cylinder);
		assert(sphere instanceof Sphere);
	}
	
}
