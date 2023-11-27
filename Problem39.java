import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Problem39 extends GraphicsProgram {
	public void run() {
		GOval oval = new GOval(50, 50);
		add (oval, 0, getHeight() / 2 + 50 );
	}
}
