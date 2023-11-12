import acm.graphics.*;
import acm.program.*;

public class Problem14 extends GraphicsProgram {
	private static final int FACE_Y = 200;
	private static final int FACE_X = 200;
	private static final int EYES_Y = 80;
	private static final int EYES_X = 80;
	private static final int MOUTH_Y = 30;
	private static final int MOUTH_X = 70;
	public void run() {
		drawFace();
		drawEyes();
		//drawMouth();
	}
	private void drawEyes() {
		GRect eye1 = new GRect ( EYES_X , EYES_Y );
		add ( eye1, getWidth() / 2 - 3 * EYES_X / 2 , getHeight() / 2 + EYES_Y );
		GRect eye2 = new GRect ( EYES_X , EYES_Y );
		add ( eye2, getWidth() / 2 + EYES_X / 2 , getHeight() / 2 + EYES_Y );
		
	}
	private void drawFace() {
		GRect face = new GRect ( FACE_X , FACE_Y );
		add ( face , getWidth() / 2 - FACE_X / 2 , getHeight() / 2 - FACE_Y / 2);
		
	}
}