import acm.program.ConsoleProgram;

public class Problem31 extends ConsoleProgram {
	public void run() {
		int n = readInt ("enter a number: ");
		int div = 0;
		for (int i = 0; i <= n; i++) {
			if ( n % i == 0) {
				div ++; 
			}
		}
		println (div);
		if ( div == 2 ) {
			println ("prime");
		} 
	}
}