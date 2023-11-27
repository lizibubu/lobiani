import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem40 extends GraphicsProgram {
	public void run() {
		GOval oval = new GOval(50, 50);
		add (oval, 0, getHeight() / 2 - 50 );
		double xv = 10;
		double yv = 0;
		while (true) {	
			while (oval.getX() + oval.getWidth() <= getWidth()) {
				pause(50);
				oval.move(xv, yv);
			}
			oval.setLocation(getWidth() - oval.getWidth(), oval.getY());
			while (oval.getX() + oval.getWidth() <= getWidth()&& oval.getX() + oval.getWidth() != 0 ) {
				pause(50);
				oval.move(-xv, yv);
			}
			oval.setLocation( 0, oval.getY());
		}
	}
}	 