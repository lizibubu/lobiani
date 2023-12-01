import acm.program.ConsoleProgram;

public class log extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter n: ");
		int m = readInt ("Enter m: ");
		println(logar(n, m));
	}

	private int logar(int n, int m) {
		int ans = 0;
		for (int i = n; i < m; i*=n) {
			ans ++;
			if ( m == i ) {
				return ans;
			}
		}
		return 0;
	}
}	
		