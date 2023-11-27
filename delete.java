import acm.program.ConsoleProgram;

public class delete extends ConsoleProgram{
	public void run(){
		String s = readLine("Enter Text: ");
		if(isPalindramOptimal(s.toLowerCase())){
			println("Is Palindrom!");
		}else{
			println("Not Palindrom!");
		}
	}
	
	private boolean isPalindramOptimal(String s){
		int size = s.length();
		for(int i = 0; i <= size/2; i++){
			if(s.charAt(i) != s.charAt(size - 1 - i)){
				return false;
			}
		}
		return true;
	}

	private boolean isPalindrom(String s) {
		String rev = reverse(s);
		if(rev.equals(s)){
			return true;
		}
		return false;
	}

	private String reverse(String s) {
		String res = "";
		for(int i = s.length() - 1; i >= 0; i--){
			res += s.charAt(i);
		}
		return res;
	}
}