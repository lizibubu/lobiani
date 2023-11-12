import acm.graphics.*;
import acm.program.*;

public class Problem21 extends GraphicsProgram {
	public void run() {
		verticalLines();
		horizontalLines();
	}

	private void horizontalLines() {
		double dis = getHeight() / 10;
		for (int i = 1; i < 10; i++) {
			GLine horizontal = new GLine( 0, i * dis, getWidth(), i * dis );
			add(horizontal);
		}
	}

	private void verticalLines() {
		double distance = getWidth() / 10;
		for (int i = 1; i < 10; i++) {
			GLine vertical = new GLine( i * distance, 0, i * distance, getHeight());
			add(vertical);
		}
	}
}
