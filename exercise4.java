import acm.program.ConsoleProgram;

public class exercise4 extends ConsoleProgram {
	public void run() {
		String w = readLine("enter text: ");
		char ans = countMax(w);
		print(ans);
		}


	private char countMax(String w) {
		int max = 0;
		char maxch = ' ';
		for (int i = 0; i < w.length(); i++) {
			int amount = countLetter(w, w.charAt(i));
			if (amount > max) {
				max = amount;
				maxch = w.charAt(i);
			}
		}
		return maxch;
	}


	private int countLetter(String w, char ch) {
		int ans = 0;
		for (int i = 0; i < w.length(); i++) {
			if (w.charAt(i) == ch) {
				ans++;
			}
		}
		return ans;
	}
}