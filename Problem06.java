import stanford.karel.Karel;

public class Problem06 extends Karel {
	public void run() {
		move();
		takefromsecondcell();
		move();
		takefromthirdcell();
	}

	private void takefromthirdcell() {
		while (beepersPresent()) {
			pickBeeper();
			move();
			putBeeper();
			turnLeft();
			turnLeft();
			move();
			turnLeft();
			turnLeft();
		}
	}

	private void takefromsecondcell() {
		while (beepersPresent()) {
			pickBeeper();
			move();
			move();
			putBeeper();
			turnLeft();
			turnLeft();
			move();
			move();
			turnLeft();
			turnLeft();
		}
	}
}