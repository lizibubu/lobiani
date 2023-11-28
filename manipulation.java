import acm.program.ConsoleProgram;

public class manipulation extends ConsoleProgram {
	public void run() {
		String text1 = readLine("enter text: ");
		String text2 = readLine ("enter manipulation text: ");
		for ( int i = 1; i < text1.length() - 1; i++) {
			String part1 = text1.substring(0, i);
			String part2 = text1.substring(i);
			if (canManipulate(part1, part2, text2)) {
				return true;
			}
		}
		return false;
	}

	private boolean canManipulate(String part1, String part2, String text2) {
		for (int i = 0; i < part1.length(); i++) {
			String substracted1 = substractStr(part1, part1.charAt(i));
			for (int j = 0; j < part2.length(); j++) {
				String substracted2 = substractStr(part2, part2.charAt(j));
				String newText = substracted1 + substracted2;
				if(newText.equals(text2)) {
					return true;
				}
			}
		}
		return false;
	}

	private String substractStr(String part1, char charAt) {
		String newStr = "";
		for (int i = 0; i < text.length(); i++) {
			
			
		}
	}

}
