import acm.program.ConsoleProgram;

public class Problem20 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter numberS: ");
		int sum = 0;
		for(int i = 0; i < n; i++){
			sum += readInt("Enter number: ");
		}
		println("sum is: " + sum);
	}

}
