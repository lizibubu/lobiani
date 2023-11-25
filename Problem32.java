import acm.program.ConsoleProgram;

public class Problem32 extends ConsoleProgram {
	public void run() {
		int n = readInt ("enter a number: ");
		int div = 0;
		for (int i = 1; i <= n; i++) {
			if ( n % i == 0 ) {
				div ++;
			}
		}
		for ( int j = 1; j <= 1000000; j++ ) {
			if ( div == 2 ) {
			println ("prime");
			} else {
			println ("not prime");
			}
		}
	}		
}
