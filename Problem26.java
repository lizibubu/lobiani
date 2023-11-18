import acm.program.ConsoleProgram;

public class Problem26 extends ConsoleProgram {
	public void run() {
		int a = readInt ("first number: ");
		int b = readInt ("second number: ");
		int small = a;
		if (b < a) {
			small = b;
		}
		while (small > 0 ) {
			if ( a % small == 0 && b % small == 0 ) {
				println(small);
				break;
			}
			small--;
		}
	}
}
