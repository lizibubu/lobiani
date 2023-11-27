import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem37 extends ConsoleProgram {
	private RandomGenerator rgen = RandomGenerator.getInstance();

	public void run() {
		int userNumber = readInt("Enter number: ");
		if (userNumber == rgen.nextInt(0, 36)) {
			println("win");
		} else {
			println("lose");
		}
	}
}