import acm.program.ConsoleProgram;

public class Problem47 extends ConsoleProgram {
	public void run() {
		String word = "Enter Word: ";
		if (isPalindrom(word)) {
			println("palindromia");
		} else {
			println("ar aris palindromi");
		}
		
	}

	private boolean isPalindrom(String word) {
		for (int i = 0; i < word.length(); i++) {
			char first = word.charAt(i);
			char last = word.charAt(word.length() - 1 - i);
			if ( first == last ) {
				return true;
			}
		}
		return false;
	}

}
