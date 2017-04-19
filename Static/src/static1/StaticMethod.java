package static1;
class a1 {
	int i = 10;
	/*
	 * static is modifier, It is modifying the behaviour of the method. A static method
	 * can be called without object. 
	 */
	static void m1(){
		int  i = 15;
		System.out.println("i = " + i);
	}
	
	/*static void m2(){
		i = 15;
		System.out.println("i = " + i);
	}*/
	
	static void m3(){
		a1 a1O3 = new a1();
		a1O3.i = 22;
		
	}
	
	static void m4(){
		// m5(); incorrect. 	
	}
	
	void m5(){
		
	}
}
public class StaticMethod {
	public static void main (String args[]){
		a1 a1O1 = new a1();
		a1.m1(); // correct
		a1O1.m1(); // correct
		//====================
		
		//a1.m2(); // incorrect
		//a1O1.m2(); // incorrect
		/*
		 * Because i is non-static, it can be accessed only by object, not by class reference. 
		 * even when a1O1.m2() is used, this is incorrect. 
		 * 
		 * Reason: when a1O1.m2() is used, internally JVM uses a1.m2(). Thus, whether m1() is 
		 * called by an object, but JVM is using class reference for calling m1(). 
		 * 
		 * INFERENCE : static method can not call an instance variable directly. 
		 */
		
		// ==================================
		// how to do this indirectly
		a1 a1O4 = new a1();
		System.out.println(a1O4.i); // o/p is 10
		a1.m3();
		System.out.println(a1O1.i); // o/p is 10
		System.out.println(a1O4.i); // o/p is 10
		/*
		 * this shows that i is not changed in method manipulation. 
		 * Because static method is referred by class reference, whether it is called 
		 * by the object of the class. 
		 */
		/* "this" in static method
		 *  ======================
		 * this can not be used in static method. "this" will point to null, since static is 
		 * called by class reference.  
		 */  
		
		/*
		 * static method can not call instance method
		 * ==========================================
		 * As shown in method m4. 
		 * Since non-static method can not be called with class reference. It can be called
		 * only by object. 
		 * Static method can call a static method
		 * 
		 * super in static method
		 * ======================
		 * super cannot be used in static method.
		 * 
		 *  
		 */
		
	}

}
