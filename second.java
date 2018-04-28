package pksoft;

import java.awt.*;


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public  class second extends JFrame {
// Graphics Desgn
private JSlider js;
private first DrawO;

public second() {
	super("kidpk");
	js = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 10);
	DrawO = new first();
	DrawO.setBackground(Color.orange);
	js.setMajorTickSpacing(10);
	js.setPaintTicks(true);
	
	// Event
	js.addChangeListener(
			new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
		    	   DrawO.setD(js.getValue());
				}
			}
			);
	
	add(js, BorderLayout.SOUTH);
	add(DrawO, BorderLayout.CENTER);
	
}
	
}
