import acm.program.ConsoleProgram;

public class Problem48 extends ConsoleProgram {
	public void run() {
		String word = readLine("enter word: ");
		showStatistics(word);
	}

	private void showStatistics(String word) {
		for (int i = 0; i < 26; i++ ) {
			char w = (char) ('a' + i);
			int sum = 0;
			for(int j = 0; j < word.length(); j++){
				if(word.charAt(j) == w){
					sum++;
				}
			}
			println(w + sum);
			
		}
		
	}

}
