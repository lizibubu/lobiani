import java.util.ArrayList;
import acm.program.ConsoleProgram;

public class Problem61 extends ConsoleProgram {
	public void findSumCouples(ArrayList<Integer> list, int sum){
		for(int i = 0; i < list.size(); i++){
			for(int j = i + 1; j < list.size(); j++){
				int a = list.get(i);
				int b = list.get(j);
				if(a + b == sum){
					println(a + "-" + b);
				}
			}
		}
	}
}