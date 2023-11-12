import acm.program.ConsoleProgram;

public class Problem19 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number: ");
		while (n <= 0) {
			n = readInt("Enter positive number: ");
		}
		for (int i = 0; i < n; i++) {
			println("Hello " + i);
		}
	}
}
