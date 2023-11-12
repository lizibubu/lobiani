import acm.program.ConsoleProgram;

public class Problem18 extends ConsoleProgram {
	public void run() {
		int a = readInt ("Number: ");
		int b = readInt ("Another number: ");
		int max = maximum (a, b);
		println (max);
	}

	private int maximum(int a, int b) {
		if ( a > b ) {
			return a;
		}
		return b;
	}
}
