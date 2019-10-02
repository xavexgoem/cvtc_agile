package org.cvtc.shapes;

public abstract class Shape {
	
	private Dialog messageBox;
	
	protected Dialog getMessageBox() {
		return messageBox;
	}
	private void setMessageBox(Dialog messageBox) {
		this.messageBox = messageBox;
	}
	
	Shape(Dialog messageBox) {
		setMessageBox(messageBox);
	}
	
	abstract float surfaceArea();
	abstract float volume();
}
