import acm.program.ConsoleProgram;

public class Problem58 extends ConsoleProgram{
	public void run(){
		
	}
	
	private boolean isMagic(int[][] m){
		int n = m.length;
		for(int i = 1; i <= n; i++){
			if(!containsMatrix(m, i)){
				return false;
			}
		}
		return true;
	}

	private boolean containsMatrix(int[][] m, int num) {
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[0].length; j++){
				if(m[i][j] == num){
					return true;
				}
			}
		}
		return false;
	}
}