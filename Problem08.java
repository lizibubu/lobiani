import stanford.karel.SuperKarel;

public class Problem08 extends SuperKarel {
	public void run() {
		move();
		transportBeepersToForth();
		move();
		while (beepersPresent()) {
			pickBeeper();
			move();
			pickBeeper();
			turnAround();
			move();
			turnAround();
		}
	}	

	private void transportBeepersToForth() {
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
}