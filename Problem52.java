import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Problem52 extends ConsoleProgram {
	public void run() {
		try {
			BufferedReader rder = new BufferedReader(
						new FileReader("Seminari52.java")
					);
			while(true){
				String line = rder.readLine();
				if(line == null){
					break;
				}
				println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}