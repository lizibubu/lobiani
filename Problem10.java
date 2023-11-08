import stanford.karel.SuperKarel;

public class Problem10 extends SuperKarel {
	public void run() {
		move();
		while (beepersPresent()) {
			move();
			turnLeft();
			while (beepersPresent()) {
				pickBeeper();
				move();
				putBeeper();
				move();
				putBeeper();
				turnAround();
				move();
				move();
				turnAround();
			}
			move();
			move();
			turnAround();
			while (beepersPresent()) {
				pickBeeper();
				move();
				move();
				putBeeper();
				turnAround();
				move();
				move();
				turnAround();
			}
			move();
			move();
			turnRight();
			while (beepersPresent()) {
				pickBeeper();
				move();
				pickBeeper();
				turnAround();
				move();
				turnAround();
			}
			turnAround();
			move();
			putBeeper();
			turnAround();
			move();

			turnRight();
			move();
			turnAround();
			while (beepersPresent()) {
				pickBeeper();
				move();
				putBeeper();
				turnAround();
				move();
				turnAround();
			}
			move();
			turnRight();
			move();
			turnAround();
		}
	}
}