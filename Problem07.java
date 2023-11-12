import stanford.karel.SuperKarel;

public class Problem07 extends SuperKarel {
	public void run() {
		while(leftIsClear()){
			fillaline();
			goback();
			if (leftIsClear()) {
				turnLeft();
				move();
				turnRight();
			}
		}
		fillaline();
	}

	private void goback() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		turnAround();
	}

	private void fillaline() {
		if (noBeepersPresent()) {
			putBeeper();
		}
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				putBeeper();
			}
		}
	}
}