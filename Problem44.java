import java.awt.event.MouseEvent;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem44 extends GraphicsProgram {
	private GOval ball = null;

	public void run() {
		addMouseListeners();
		while (true) {
			if (ball != null) {
				ball.move(0, 3);
			}
			pause(100);
		}
	}

	public void mouseClicked(MouseEvent e) {
		if (ball == null) {
			ball = new GOval(50, 50);
			ball.setFilled(true);
			ball.setLocation(e.getX(), e.getY());
			add(ball);
		} else {
			ball.setLocation(e.getX(), e.getY());
		}
	}
}