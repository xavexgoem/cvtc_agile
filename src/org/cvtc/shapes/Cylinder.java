package org.cvtc.shapes;

public class Cylinder extends Shape implements Renderer {
	
	private float radius;
	private float height;
	
	public Cylinder(Dialog messageBox) {
		super(messageBox);
	}
	
	public Cylinder(Dialog messageBox, float radius, float height) {
		super(messageBox);
		if(radius > 0 && height > 0) {
			this.radius = radius;
			this.height = height;
		} else {
			throw new IllegalArgumentException("Arguments must be greater than 0.");
		}
	}

	@Override
	public float surfaceArea() {
		return (float)((2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)));
	}

	@Override
	public float volume() {
		return (float)(Math.PI * Math.pow(radius, 2) * height);
	}

	@Override
	public void render() {
		String message = "Cylinder has surface area " + surfaceArea() + " and volume " + volume();
		getMessageBox().show(message, "");
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
