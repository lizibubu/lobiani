import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class exercise3 extends GraphicsProgram {
	private GOval oval = null;
	public void run() {
		oval = new GOval (100, 100);
		oval.setFilled(true);
		add(oval, getWidth() / 2 , getHeight() / 2);
		addMouseListeners();
		oval.move(0, 3);
	}
	public void mouseClicked(MouseEvent e) {
		
	}

}
