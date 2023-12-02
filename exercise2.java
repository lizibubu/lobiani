import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class exercise2 extends GraphicsProgram {
	private GOval oval = null;
	public void run() {
		oval = new GOval (100, 100);
		add(oval, getWidth() / 2, getHeight() / 2);
		addMouseListeners();
	}
	
	public void mouseDragged(MouseEvent e) {
		if (getElementAt(e.getX(), e.getY()) == oval ){
			oval.setLocation(e.getX() - 10, e.getY() - 10 );
		}
	}

}
