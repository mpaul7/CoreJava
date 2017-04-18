package inheritance1;

class a1{
	
	int j; // initialized implicitly as zero.
	void m1(){
		int i = 10;
		/*this is allowed i.e. a variable can be declared in the class
		 * and can be initialized in a method of same class. 
		 */
		j = 20; 
		//========================
		/*Declaration and initialization only in one line
		 */
		//int k;
		//k = 0;
		}
	}

public class AccessInstanceVariable extends a1 {
//public class AccessInstanceVariable {
 public static void main(String args[]){
	 a1 a1O1 = new a1();
	 /*A variable defined in a method can be accessed . 
	  * Through object, varibles that are declared and initialized
	  * inside a class but outside a method.
	  * When a variable is defined inside a method, it is bydefault 
	  * private and never made public. When method is exited, the private 
	  * varible is automatically exited. 
	  */
	 
	  //a1O1.i; 
	  //a1O1.j; // error
	  /*since instance variable i is not initialized, so it will be
	  * initialized implicitly as zero. 
	  */
	 System.out.println(a1O1.j);
	 /*If only object name is givne in SOP, then it will not give 
	  * error. It is just a run time error.
	  */
	 System.out.println(a1O1);
 }
}
