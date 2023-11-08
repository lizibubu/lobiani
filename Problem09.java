import stanford.karel.Karel;

public class Problem09 extends Karel {
	public void run() {
		move();
		while (beepersPresent()) {
			pickBeeper();
			move();
			transferBeepers();
		}
	}
	
	private void transferBeepers() {
		addBeepers();
		move();
		move();
		turnAround();
		returnBeepers();
		for (int i = 0; i < 3; i++) {
			move();
		}
		turnAround();
	}
	
	// adds beepers from third to fourth and fifth
	private void addBeepers() {
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
	}
	
	// returns beepers from fifth to third
	private void returnBeepers() {
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
	}
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
}