import acm.program.ConsoleProgram;

public class Problem17 extends ConsoleProgram {
	public void run() {
		double number = readDouble("Number: ");
		println((int)number);
		println(number - (int)number);
	}
}
