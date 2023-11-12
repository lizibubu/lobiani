import acm.graphics.*;
import acm.program.*;

public class Problem12 extends GraphicsProgram {
	private static final int HOUSE_Y = 200;
	private static final int HOUSE_X = 200;
	
	public void run() {
		drawWalls();
		// drawRoof;
		// drawDoor;
		//drawWindows;
		
	}
	private void drawWalls() {
		GRect walls = new GRect (HOUSE_X , HOUSE_Y );
		add( walls, getWidth() / 2 - HOUSE_X / 2 , getHeight() / 2 + HOUSE_Y / 2 );
	}

}
