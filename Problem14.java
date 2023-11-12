import acm.graphics.*;
import acm.program.*;

public class Problem14 extends GraphicsProgram {
	private static final int FACE_Y = 300;
	private static final int FACE_X = 300;
	private static final int EYES_Y = 80;
	private static final int EYES_X = 80;
	private static final int MOUTH_Y = 80;
	private static final int MOUTH_X = 200;
	public void run() {
		drawFace();
		drawEyes();
		drawMouth();
	}
	private void drawMouth() {
		GRect mouth = new GRect ( MOUTH_X , MOUTH_Y );
		add ( mouth, getWidth() / 2 - MOUTH_X / 2 , getHeight() / 2 + FACE_Y / 2 - MOUTH_Y - 25 ); 
	}
	private void drawEyes() {
		GRect eye1 = new GRect ( EYES_X , EYES_Y );
		add ( eye1, getWidth() / 2 - FACE_X / 2 + 25 , getHeight() / 2 - FACE_Y / 2 + 25 );
		GRect eye2 = new GRect ( EYES_X , EYES_Y );
		add ( eye2, getWidth() / 2 + FACE_X / 2 - EYES_X - 25 , getHeight() / 2 - FACE_Y / 2 + 25 );
		
	}
	private void drawFace() {
		GRect face = new GRect ( FACE_X , FACE_Y );
		add ( face , getWidth() / 2 - FACE_X / 2 , getHeight() / 2 - FACE_Y / 2);
		
	}
}