import java.awt.Color;
import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;

public class Problem34 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		drawCircles(1000);
	}

	private void drawCircles(int n) {
		for (int i = 0; i < n; i++) {
			makeRandCircle();
			pause(100);
		}
	}

	private void makeRandCircle() {
		int r = rgen.nextInt( 0, getWidth() / 10 );
		int x = rgen.nextInt( 0, getWidth() - 2 * r );
		int y = rgen.nextInt( 0, getHeight() - 2 * r );
		Color color = rgen.nextColor();
		GOval oval = new GOval( r * 2 , r * 2 );
		oval.setLocation(x, y);
		oval.setFilled(true);
		oval.setFillColor(color);
		add(oval);
		pause(200);
	}
}