import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem38 extends ConsoleProgram {
	
	private RandomGenerator random;
	private static final int START_BALANCE = 1000;
	
	public void run() {
		random = RandomGenerator.getInstance();
		int balance = START_BALANCE;
		while (balance > 0) {
			println("you have " + balance );
			int bet = readInt("enter bet amount: ");
			if (bet > balance) {
				println("not enough money, please try again later.");
				continue;
			}
			int number = readInt("enter number: ");
			balance += result(number, bet);
		}
	}
	
	private int result(int chosenNumber, int bet) {
		int spinnedNumber = random.nextInt(0, 36);
		println(".... " + spinnedNumber);
		if (spinnedNumber == chosenNumber) {
			println("winner");
			return 35 * bet;
		}
		println("loser");
		return -bet;
	}
}