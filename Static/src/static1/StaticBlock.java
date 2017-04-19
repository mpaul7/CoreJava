package static1;

/*
 * Static block is a piece of code in a class that is loaded as soon as the class is loaded
 * before the execution of the main method. 
 * Static block is not a mehod. 
 * 
 * 
 * static blocks are executed in the order in which they appear in the class. 
 * Even if the class has no main method, even then the static blocks will be executed without 
 * error. 
 * 
 * First static variables are created, then
 * static block, then 
 * main method. 
 */

public class StaticBlock {
	static int i = 10; // static variable is created first. 
	static {
		System.out.println(i);
    	}
	static {
		System.out.println("1");
    	}
	static {
		System.out.println("2");
    	}
	public static void main(String args[]){
		System.out.println("main method");
	}

}
