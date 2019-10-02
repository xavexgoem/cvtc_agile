package org.cvtc.shapes;

public class ShapeFactory {

	private Dialog dialog;
	
	public ShapeFactory(Dialog dialog) {
		setDialog(dialog);
	}
	
	public Shape make(ShapeType type) {
		Shape shape;
		switch(type) {
		case CUBOID:
			shape = new Cuboid(dialog);
			break;
		case SPHERE:
			shape = new Sphere(dialog);
			break;
		case CYLINDER:
			shape = new Cylinder(dialog);
			break;
		default:
			shape = null; // whomp whomp
		}
		return shape;
	
	}

	private Dialog getDialog() {
		return dialog;
	}

	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
}
