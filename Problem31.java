import acm.program.ConsoleProgram;

public class Problem31 extends ConsoleProgram {
	public void run() {
		int a = readInt ("enter a: ");
		int div = 0;
		for (int i = 0; i <= a; i++) {
			if ( a % i == 0) {
				div ++; 
			}
		}
		if ( div == 2 ) {
			println ("prime");
		} else {
			println ("not prime");
		}
	}
}
