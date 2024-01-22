import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Problem62list extends ConsoleProgram {
	public void run() {
		ArrayList<String> list = new ArrayList<>();
		while (true) {
			String next = readLine("Enter name: ");
			if (next.equals("")) {
				break;
			}
			list.add(next);
		}
		while (list.size() > 0) {
			String next = list.get(0);
			int count = countNames(list, next);
			println(next + " - " + count);
			removeFromList(list, next);
		}
	}

	private void removeFromList(ArrayList<String> list, String next) {
		for (int i = list.size() - 1; i >= 0; i--) {
			if (list.get(i).equals(next)) {
				list.remove(i);
			}
		}
	}

	private int countNames(ArrayList<String> list, String next) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(next)) {
				count++;
			}
		}
		return count;
	}
}