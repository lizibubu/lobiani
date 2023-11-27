import acm.program.ConsoleProgram;

public class Problem49 extends ConsoleProgram {
	public void run() {
		String n = readLine ("enter number: ");
		print(stringtoInteger(n));
	}

	private int stringtoInteger(String n) {
		int result = 0;
		for (int i = 0; i < n.length(); i++ ) {
			int b = n.charAt(i) - '0';
			result = result * 10 + b;
		}
		return result;
	}
}
