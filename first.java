package pksoft;
import java.awt.*;
import javax.swing.*;

public class first extends JPanel { 
	private Double sum;
	private int d =10;
	

	
	public void paint(Graphics g) {
		
		super.paint(g);
		g.fillOval(10, 10, d, d);
		
	}
	public void setD(int newD) {
		d= (newD >=0 ? newD : 10); 
		// Compresive if statement
		// 


		repaint();
		
	}
	
	public Dimension PreferedSize() {
		return new Dimension(200,200);
	}
	
	public Dimension minSize() {
		return  PreferedSize();
	}
}

