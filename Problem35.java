import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem35 extends ConsoleProgram {
	RandomGenerator rg = RandomGenerator.getInstance();
	
	public void run(){
		int n = readInt("Enter amount: ");
		int sum = 0;
		for(int i = 0; i < n; i++){
			int amount = oneExperiment();
			sum += amount;
		}
		double ans = (double)sum / n;
		println(ans);
	}

	private int oneExperiment() {
		int amount = 0;
		while(true){
			boolean b = rg.nextBoolean();
			amount++;
			if(b){
				break;
			}
		}
		return amount;
	}
	
	
}