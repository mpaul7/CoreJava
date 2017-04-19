package static1;

/*
 * Static variable is associated with class, not with object. When ever the class is loaded,
 * static variable is available.
 */

public class StaticVariable {
	static int  i = 10;
	int j = 15;
	void m1(){
		
	}

	/*
	 * When class is executed like <java StaticVariable>, then the java interpreter makes a 
	 * copy of "i" because it is static variable. The interpreter will not make copy of "j" 
	 * because it is not instance variable. 
	 * Instance variables are only initialized when called by an object of the class. While 
	 * execution instance variables are not called.   
	 */
	public static void main (String args[]){
		System.out.println(i); // o/p is 10
		//System.out.println(j); // this will return error
		StaticVariable O1 = new StaticVariable(); // If an object of class is made,
		System.out.println(O1.j);
	}
	
	/*
	 * static or class Variable						Instance Variable
	 * =========================					==================
	 * associated with class						associated with object.
	 * 
	 * can be called by class reference				a concrete object must be used to call
	 * 
	 * created when the class is loaded				created when an object is created. Instance 
	 * every object has the same copy of			variable are created again and again, 
	 * static variables (shared copy)				every time an object is created.
	 * 
	 * As soon as class is available in memory
	 * the static variables of the class are 
	 * defined and memory will be reserved only 
	 * once for it. 
	 * 
	 * So when an object of a class is created, it has shared copy of all static variables 
	 * and its own data. 
	 */
}
