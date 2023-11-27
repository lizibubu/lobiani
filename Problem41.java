import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem41 extends GraphicsProgram {
	private boolean isActive = false;

	public void run() {
		addMouseListeners();
	}

	public void mouseMoved(MouseEvent e) {
		if (isActive) {
			GOval oval = new GOval(3, 3);
			oval.setFilled(true);
			oval.setLocation(e.getX(), e.getY());
			add(oval);
		}
	}

	public void mouseClicked(MouseEvent e) {
		isActive = !isActive;
	}

}