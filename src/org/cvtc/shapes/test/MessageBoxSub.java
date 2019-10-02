package org.cvtc.shapes.test;

import javax.swing.JOptionPane;
import org.cvtc.shapes.Dialog;

public class MessageBoxSub implements Dialog {
	public int show(String message, String title) {
		return JOptionPane.OK_OPTION;
	}
}
