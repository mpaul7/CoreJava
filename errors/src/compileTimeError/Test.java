package compileTimeError;

public class Test {
	static String longString = " hello" ;
	int key; 
	int value ;
	
	void f(){
		int n = 10;
		}
	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		System.out.println(i % 8);
		/*if (i % 8 == 7) System.out.println();*/
		}
		System.out.println();
		}
	
	static void  g(){
		int m = 20 ; 
		if (true)
			m = 10;
		else m = 12;
		}
	
	public static void main(String[] args) {
		g();
		//System.out.println(longString.substring(1, 8));
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(java.util.Arrays.toString(a));
		//print(a);
		Test t = new Test();
		System.out.println(t);
		}
	public String toString() {
		return "The value at key " + key + " is " + value;
		}
	
	}
