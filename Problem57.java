import acm.program.ConsoleProgram;

public class Problem57 extends ConsoleProgram {
	public void run(){
		String s1 = readLine("Enter s1: ");
		String s2 = readLine("Enter s2: ");
		int[] s1LetterCount = getLetterCountArray(s1);
		int[] s2LetterCount = getLetterCountArray(s2);
		if(arrayEquals(s1LetterCount, s2LetterCount)){
			println("is anagram");
		}
	}
	
	private boolean arrayEquals(int[] a, int[] b) {
		for(int i = 0; i < a.length; i++){
			if(a[i] != b[i]){
				return false;
			}
		}
		return true;
		
	}

	private int[] getLetterCountArray(String s) {
		int[] arr = new int[26];
		for(int i = 0; i < s.length(); i++){
			char ch = s.charAt(i);
			int index = (int)(ch - 'a');
			arr[index]++;
		}
		return arr;
	}

	private void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			print(arr[i] + " ");
		}
		println();
	}
}