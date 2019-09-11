package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class Cylinder extends Shape {
	
	private float radius;
	private float height;
	
	Cylinder(float radius, float height) {
		if(radius > 0 && height > 0) {
			this.radius = radius;
			this.height = height;
		} else {
			throw new IllegalArgumentException("Arguments must be greater than 0.");
		}
	}

	@Override
	float surfaceArea() {
		return (float)((2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)));
	}

	@Override
	float volume() {
		return (float)(Math.PI * Math.pow(radius, 2) * height);
	}

	@Override
	void render() {
		String message = "Cylinder has surface area " + surfaceArea() + " and volume " + volume();
		JOptionPane.showMessageDialog(null, message);
	}
	
	public float getRadius() {
		return radius;
	}
	
	public void setRadius(float radius) {
		if(radius > 0) {
			this.radius = radius;
		} else {
			throw new IllegalArgumentException("Radius must be greater than 0.");
		}
	}
	
	public float getHeight() {
		return height;
	}
	
	public void setHeight(float height) {
		if(height > 0) {
			this.height = height;
		} else {
			throw new IllegalArgumentException("Height must be greater than 0.");
		}
	}
	
}
