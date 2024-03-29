import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class Problem63 extends ConsoleProgram {
	public void run() {
		Map<String, Integer> map = new HashMap<>();
		while (true) {
			String name = readLine("Enter name: ");
			if (name.equals("")) {
				break;
			}
			if (!map.containsKey(name)) {
				map.put(name, 0);
			}
			map.put(name, map.get(name) + 1);
		}
		for(String name : map.keySet()){
			println(name + " - " + map.get(name));
		}
	}
}