package static1;

/*
 * Static inner class also called as nested class. 
 * Static inner class can use the private variables of outer class
 * no inheritance relationship between outer and inner class.
 * Note: Outer class can never be static. 
 */
public class StaticInnerClass {
	
	// static inner class. 
	static class a {
		}
	/*
	 * During execution, we will have
	 * StaticInnerClass.class
	 * a.class
	 * a$b.class
	 * 
	 * Note: To make an object of the inner class, you must have the object of outer class
	 * reference available. 
	 */
	
	// outer class constructor
	StaticInnerClass (){
		a O4 = new a();
		}
	
	public static void main(String args[]){
		//StaticInnerClass.a O1 = new StaticInnerClass().new a();
		// or
		StaticInnerClass O2 = new StaticInnerClass(); 
		//a O2 = new a(); 
		
		/*
		 * Why the object of outer class is created first. 
		 * ===============================================
		 * Because a class is loaded when its object is created. Therefore, outer class object 
		 * is created first. 
		 * 
		 * Another method
		 * ===============
		 * Object of inner class can be created in the constructor of outer class.
		 * When an object of the outer class is made, it will call the default constructor
		 * of the class, and in the body of the constructor an object of the inner class is 
		 * created. 
		 */
	}

}
