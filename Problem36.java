import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Problem36 extends ConsoleProgram{
	RandomGenerator rg = RandomGenerator.getInstance();
	
	public void run(){
		int exp = readInt("Enter Amount: ");
		int sum = 0;
		for(int i = 0; i < exp; i++){
			int amount = beforeThreeExp();
			sum += amount;
		}
		double ans = (double)sum / exp;
		println(ans);
	}
	
	private int beforeThreeExp(){
		int amount = 0;
		int bor = 0;
		while(true){
			boolean b = rg.nextBoolean();
			amount++;
			if(b){
				bor++;
				if(bor == 3){
					break;
				}
			}else{
				bor = 0;
			}
		}
		return amount;
	}
	
	
}