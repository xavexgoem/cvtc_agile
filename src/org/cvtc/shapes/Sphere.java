package org.cvtc.shapes;

public class Sphere extends Shape implements Renderer {
	
	private float radius;
	
	public Sphere(Dialog messageBox) {
		super(messageBox);
	}
	
	public Sphere(Dialog messageBox, float radius) {
		super(messageBox);
		if(radius > 0) {
			this.radius = radius;
		} else {
			throw new IllegalArgumentException("Radius must be greater than 0.");
		}
	}

	@Override
	public float surfaceArea() {
		return (float)(4 * Math.PI * Math.pow(radius, 2));
	}

	@Override
	public float volume() {
		return (float)((4.0/3.0) * Math.PI * Math.pow(radius, 3));
	}

	@Override
	public void render() {
		String message = "Sphere surface area is " + surfaceArea() + " and volume is " + volume();
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

}
