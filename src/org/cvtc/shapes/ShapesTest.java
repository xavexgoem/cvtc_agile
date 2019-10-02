package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
		
		Dialog messageBox = new MessageBox();
		ShapeFactory shapeFactory = new ShapeFactory(messageBox);
			
		// OK, but if we're casting anyway *what's the point*?
		Sphere sphere = (Sphere) shapeFactory.make(ShapeType.SPHERE);
		Cylinder cylinder = (Cylinder) shapeFactory.make(ShapeType.CYLINDER);
		Cuboid cuboid = (Cuboid) shapeFactory.make(ShapeType.CUBOID);
		
		sphere.setRadius(5);
		cylinder.setRadius(5);
		cylinder.setHeight(5);
		cuboid.setDepth(5);
		cuboid.setHeight(5);
		cuboid.setWidth(5);
		
		sphere.render();
		cylinder.render();
		cuboid.render();
		
	}

}
