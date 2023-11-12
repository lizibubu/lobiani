import acm.program.ConsoleProgram;

public class Problem24 extends ConsoleProgram {
	public void run() {
		int n = readInt ("enter a number: ");
		int div = 0;
		for (int i = 0; i <= n; i++) {
			if ( n % i == 0) {
				div ++; 
			}
		}
				
	}
}
