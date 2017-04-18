package aaTest;

public class Test1 {
	String s = "";
	static int n = 6;
	//static int sum = 0;

	public static void main(String args[]) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((i + j) > n) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
		
		int [] numbers  = {2, 12, 12};
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++){
			
		sum += numbers[i];
	}
		System.out.println(sum );
	
		
	}
}
