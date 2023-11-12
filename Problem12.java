import acm.graphics.*;
import acm.program.*;

public class Problem12 extends GraphicsProgram {
	private static final int HOUSE_Y = 200;
	private static final int HOUSE_X = 200;
	private static final int DOOR_Y = 80;
	private static final int DOOR_X = 80;
	private static final int WINDOW_Y = 50;
	private static final int WINDOW_X = 50;
	public void run() {
		drawWalls();
		drawRoof();
	    drawDoor();
		drawWindows();
		
	}
	private void drawWindows() {
		GRect window1 = new GRect ( WINDOW_X , WINDOW_Y );
		add ( window1, getWidth() / 2 - 3 * WINDOW_X / 2 , getHeight() / 2 + WINDOW_Y );
		GRect window2 = new GRect ( WINDOW_X , WINDOW_Y );
		add ( window2, getWidth() / 2 + 3 * WINDOW_X / 2 , getHeight() / 2 - WINDOW_Y );
		
	}
	private void drawDoor() {
		GRect door = new GRect ( DOOR_X , DOOR_Y );
		add ( door, getWidth() / 2 - DOOR_X / 2 , getHeight() - DOOR_Y );
	}
	private void drawRoof() {
		GLine line1 = new GLine ( getWidth() / 2 - HOUSE_X / 2 , getHeight() - HOUSE_Y , getWidth() / 2 , HOUSE_Y - 50 );
		add (line1);
		GLine line2 = new GLine ( getWidth() /2 + HOUSE_X / 2 , getHeight() - HOUSE_Y , getWidth() / 2 , HOUSE_Y - 50 );
		add (line2);
	}
	private void drawWalls() {
		GRect walls = new GRect ( HOUSE_X , HOUSE_Y );
		add( walls, getWidth() / 2 - HOUSE_X / 2 , getHeight() - HOUSE_Y );
	}

}
