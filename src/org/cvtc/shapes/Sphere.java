package org.cvtc.shapes;

import javax.swing.JOptionPane;

public class Sphere extends Shape {
	
	private float radius;
	
	Sphere(float radius) {
		if(radius > 0) {
			this.radius = radius;
		} else {
			throw new IllegalArgumentException("Radius must be greater than 0.");
		}
	}

	@Override
	float surfaceArea() {
		return (float)(4 * Math.PI * Math.pow(radius, 2));
	}

	@Override
	float volume() {
		return (float)((4.0/3.0) * Math.PI * Math.pow(radius, 3));
	}

	@Override
	void render() {
		String message = "Sphere surface area is " + surfaceArea() + " and volume is " + volume();
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

}
