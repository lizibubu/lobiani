import java.awt.event.MouseEvent;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem43 extends GraphicsProgram {
	private GOval oval = null;
	public void run() {
		oval = new GOval(50, 50);
		oval.setFilled(true);
		addMouseListeners();
	}
	
	public void mouseDragged (MouseEvent e) {
		if (getElementAt(e.getX(), e.getY()) == oval) {
			oval.setLocation(e.getX(), e.getY());
		}
	}

}
