import acm.graphics.*;
import acm.program.*;
public class Problem13 extends GraphicsProgram {
	public void run() {
		double height = getHeight() / 2;
		GLine line = new GLine ( 0 , height, getWidth(), height );
		add(line);
	}
}
