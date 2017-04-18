package practiceQuestions;

// Given an array of  N integers, can you find the sum of its elements?

public class AddArrayElements {
	



	public static void main(String[] args) {
		int numElements = 6;
		int [] num = new int[numElements];
		
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 10;
		num[5] = 11;
		
		       
	       
			int sum =  0;
			for (int i = 0; i <num.length; i++){
				sum +=num[i];
			}
			
			System.out.println(sum);
	}

}
