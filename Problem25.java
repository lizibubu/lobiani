import acm.program.ConsoleProgram;

public class Problem25 extends ConsoleProgram {
	public void run() {
		int a = readInt ("first number: ");
		int b = readInt ("second number: ");
		for ( int i = 1; i <= a * b; i++ ) {
			if ( i % a == 0 && i % b == 0 ) {
				println (i);
			}
		}
	}
}
