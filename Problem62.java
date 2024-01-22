import java.util.ArrayList;
import acm.program.ConsoleProgram;

public class Problem62 extends ConsoleProgram {
	public void run() {
		ArrayList<String> names = new ArrayList<>();
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals("")) {
				break;
			}
			names.add(name);
		}
		ArrayList<String> alreadyCounted = new ArrayList<>();
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			if(!alreadyCounted.contains(name)){
				int count = countName(names, name);
				println(name + " - " + count);
				alreadyCounted.add(name);
			}
		}
	}

	private int countName(ArrayList<String> names, String name) {
		int count = 0;
		for (String next : names) {
			if (next.equals(name)) {
				count++;
			}
		}
		return count;
	}
}