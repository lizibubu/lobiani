import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram {
	public void run() {
		GOval oval = new GOval(50, 50);
		add (oval, 0, getHeight() / 2 - 50 );
		double xv = 10;
		double yv = 0;
		while (oval.getX() + oval.getWidth() <= getWidth()) {
			oval.move(xv, yv);
		}
		oval.setLocation(getWidth() - oval.getWidth(), oval.getY());
	}
}
