import acm.graphics.*;
import acm.program.*;

public class Problem22 extends GraphicsProgram {
	public void run() {
		int xDis = getWidth() / 8;
		int yDis = getHeight() / 8;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				GRect rect = new GRect(xDis, yDis);
				rect.setLocation( j * xDis , i * yDis );
				if ((i + j) % 2 == 0) {
					rect.setFilled(true);
				}
				add(rect);
				println("i: " + i + " j: " + j + " -> " + (i * 8 + j));
			}
		}
	}
}
