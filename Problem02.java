import stanford.karel.Karel;

public class Problem02 extends Karel {
	public void run() {
		movefourtimes();
		picktenbeepers();
		move();
		puttenbeepers();
	}

	private void puttenbeepers() {
		putBeeper();
		putBeeper();
		putBeeper();
		putBeeper();
		putBeeper();
		putBeeper();
		putBeeper();
		putBeeper();
		putBeeper();
		putBeeper();
		
	}

	private void picktenbeepers() {
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		
	}

	private void movefourtimes() {
		move();
		move();
		move();
		move();
		
	}
}
