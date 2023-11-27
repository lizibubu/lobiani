import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram {
	public void run() {
		GOval oval = new GOval(50, 50);
		add (oval, 0, getHeight() / 2 - 50 );
		double xv = 0;
		double yv = 10;
		while (oval.getX() + oval.getWidth() <= getWidth()) {
			oval.move(xv, yv);
		}
	}
}
