import acm.program.ConsoleProgram;

public class exercise1 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n: ");
		int m = readInt("Enter m: ");
		int a = a(n,m);
		print(a);
	}

	private int a(int n, int m) {
		int a = 1;
		for (int i = 0; i < m; i++){
			a *= n;
		}
		return a;
		
	}
}
