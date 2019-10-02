package org.cvtc.shapes;

public class Cuboid extends Shape implements Renderer {
	
	private float width;
	private float height;
	private float depth;
	
	public Cuboid(Dialog messageBox) {
		super(messageBox);
	}
	
	public Cuboid(Dialog messageBox, float width, float height, float depth) throws IllegalArgumentException {
		super(messageBox);
		if(width > 0 && height > 0 && depth > 0) {
			this.width = width;
			this.height = height;
			this.depth = depth;
		} else {
			throw new IllegalArgumentException("Arguments must be greater than zero.");
		}
	}
	
	@Override
	public float surfaceArea() {
		return (2 * width * height) + (2 * height * depth) + (2 * width * depth);
	}

	@Override
	public float volume() {
		return width * height * depth;
	}

	@Override
	public void render() {
		String message = "Cuboid has surface area " + surfaceArea() + " and volume " + volume();
		getMessageBox().show(message, "");
	}
	
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) throws IllegalArgumentException {
		if(width > 0) {
			this.width = width;
		} else {
			throw new IllegalArgumentException("Width must be greater than zero.");
		}
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) throws IllegalArgumentException {
		if(height > 0) {
			this.height = height;
		} else {
			throw new IllegalArgumentException("Height must be greater than zero.");
		}
	}

	public float getDepth() {
		return depth;
	}

	public void setDepth(float depth) throws IllegalArgumentException {
		if(depth > 0) {
			this.depth = depth;
		} else {
			throw new IllegalArgumentException("Depth must be greater than zero.");
		}
	}

}
