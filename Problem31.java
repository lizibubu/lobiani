import acm.program.ConsoleProgram;

public class Problem31 extends ConsoleProgram {
	public void run() {
		int a = readInt ("enter a: ");
		int div = 0;
		int n = readInt ("gamyofebi");
		for (int i = 0; i <= n; i++) {
			if ( n % i == 0) {
				div ++; 
			}
		}
		if ( n == 2 ) {
			println ("prime");
		} else {
			println ("not prime");
		}
	}
}
