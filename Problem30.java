import acm.program.ConsoleProgram;

public class Problem30 extends ConsoleProgram {
	public void run() {
		int a = readInt ("enter a: ");
		int b = reverse(a);
		println(b);
	}

	private int reverse(int a) {
		int b = 0;
		while ( a != 0 ) {
			int c = a % 10;
			a = a / 10;
			b = 10 * b + c;
		}
		return b;
	}

}
