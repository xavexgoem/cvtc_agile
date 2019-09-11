package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
		// Success
		Shape sphere = new Sphere(5.0f);
		Shape cylinder = new Cylinder(5.0f, 2.0f);
		Shape cuboid = new Cuboid(2.0f, 2.0f, 2.0f);
		
		sphere.render();
		cylinder.render();
		cuboid.render();
		
		// Failure in setter
		Cylinder nonSuperCylinder = new Cylinder(5.0f, 2.0f); // Shape doesn't have setHeight
		try {
			nonSuperCylinder.setHeight(-2.0f); // bad
			nonSuperCylinder.render();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		// Failure in constructor
		try {
			cuboid = new Cuboid(-2.0f, 2.0f, 2.0f); // bad
			cuboid.render();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

	}

}
