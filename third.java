package pksoft;

import javax.swing.JFrame;

abstract public class third {
	
// sub class
	public static void main(String[] args) {
		second obj = new second();
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.setSize(230, 280);
		obj.setVisible(true);
	}
	
}
