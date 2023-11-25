import acm.graphics.GOval;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.Color;

public class Problem33 extends GraphicsProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
	public void run() {
		while (true) {
			makeRandCircle();
		}
	}

	private void makeRandCircle() {
		int r = rgen.nextInt( 0, getWidth() / 2 );
		Color color = rgen.nextColor();
		GOval oval = new GOval( r * 2, r * 2 );
		oval.setFilled(true);
		oval.setFillColor(color);
		add(oval);
		pause(200);
		remove(oval);
	}
}
