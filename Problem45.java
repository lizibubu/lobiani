import acm.program.ConsoleProgram;

public class Problem45 extends ConsoleProgram{
	public void run(){
		String w = readLine("Enter Word: ");
		String l = readLine("Enter Letter: ");
		int ans = countLetter(w, l.charAt(0));
		print(ans);
	}

	private int countLetter(String word, char ch) {
		int ans = 0;
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) == ch){
				ans++;
			}
		}
		return ans;
	}
}