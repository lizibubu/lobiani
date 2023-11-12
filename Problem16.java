import acm.program.ConsoleProgram;

public class Problem16 extends ConsoleProgram {
	public void run() {
		int a = readInt("First number: ");
		int b = readInt("Second number: ");
		int c = readInt("Third number: ");
		double harmonic = 1 / (1 / (double)a + 1.0/ b + (double)1 / c);
		println(harmonic);
	}

}
