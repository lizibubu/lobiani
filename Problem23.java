import acm.program.ConsoleProgram;

public class Problem23 extends ConsoleProgram {
	public void run() {
		int n = readInt ("enter number: ");
		int sum = 0;
		for(int i = 0; i <= n; i++){
			sum += i;
		}
		println ("!: " + sum); 
	}
	
}
