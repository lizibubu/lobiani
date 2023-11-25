import acm.program.ConsoleProgram;

public class Problem31 extends ConsoleProgram {
	public void run() {
		int n = readInt ("enter a number: ");
		int div = 0;
		for (int i = 1; i <= n; i++) {
			if ( n % i == 0 ) {
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
