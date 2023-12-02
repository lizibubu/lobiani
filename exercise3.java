import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class exercise3 extends GraphicsProgram {
	private GOval oval = null;
	public void run() {
		 addMouseListeners();
		 if (oval != null) {
			 oval.move(0, 3);
		 }
		 pause(100);
	}
	public void mouseClicked(MouseEvent e) {
		if (oval == null) {
			oval = new GOval(50, 50);
			oval.setFilled(true);
			oval.setLocation(e.getX(), e.getY());
			add(oval);	
		}
	}

}
