package inheritance1;

/*Private variable can not be called by class object outside the class. 
 * Private variable can be called inside a method in the class.
 * When this method is called by another calls, then this private variable is called.   
 */ 

class PrivateVariable{
	private int i = 10; 
	void m1(){
		System.out.println(i + " output due to m1()");
		m2(); // calling the private method. 
	}
/*Similarly, private method can not be accessed out side the
 * class object. Likewise, private variable, to access private method, first access it
 * in a public method, then access the public method outside the class. 
 */
	
	private void m2(){
		System.out.println(i + " output due to m2()");
	}
}



public class AccessPrivateVariableAndMethod {
	public static void main (String args[]){
		PrivateVariable PrivateVariableO3 = new PrivateVariable(); 
		PrivateVariableO3.m1();
		//PrivateVariableO3.i; // gives error, that private variable is invisible
	}
}
