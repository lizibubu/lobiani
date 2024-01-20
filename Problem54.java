import acm.program.ConsoleProgram;

public class Problem54 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter count: ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = readInt("Enter number: ");
		}
		int max = Integer.MIN_VALUE;
		int maxIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			int next = arr[i];
			if (next > max) {
				max = next;
				maxIndex = i;
			}
		}
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int next = arr[i];
			if (next > max2 && i != maxIndex) {
				max2 = next;
			}
		}
		println(max);
		println(max2);
	}

}