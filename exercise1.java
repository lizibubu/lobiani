import acm.program.ConsoleProgram;

public class exercise1 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n: ");
		int m = readInt("Enter m: ");
		for ( int i = 1; i <= m; i++) {
			n *= n;
			println(n);
		}
	}
}
