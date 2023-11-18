import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram {
	public void run() {
		int a = 0;
		while (true) {
			int n = readInt ("enter number: ");
			if ( n == -1 ) {
				break;
			}
			if ( n % 2 == 0) {
				a++;
			}
		}
		println (a);
	}
}
