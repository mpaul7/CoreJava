package static1;

// if the main method is in another class, other than where static variables are definded

class a {
	static int i = 10;
	int j = 15;
	
	void m1(){
		i = 14;
		}
	
	void m2(){
		i = 17;
		j = 18;
		}
	}

public class staticVariable2 {
	public static void main(String args[]){
		a aO1 = new a(); 
		// the following code will give error. 
		//System.out.println(i);
		/*
		 * Since static variable can not be called with out class reference. It should
		 * be a.i.
		 * System.out.println(i); will be correct when the static variable in the same class. 
		 */
		System.out.println(a.i); //  10
		System.out.println(aO1.i); // 10
		System.out.println(aO1.j); // 15
		
		/*
		 * When a static variable is called with the class object. like object.static variable
		 * In this case, internally the JVM is using class.static variable, though we called it
		 * by an object of the class. 
		 * 
		 *  JVM only sees only the class reference. 
		 */
		//===========================================
		/* 
		 * If variable j is made private, then it can not be called in class b. It is 
		 * having only class scope. 
		 */
		//========================================
		a aO2 = new a();
		System.out.println(a.i); //  10
		System.out.println(aO1.i); // 10
		System.out.println(aO2.i); // 10
		System.out.println(aO2.j); // 15
		
		// =================================
		// when method m1() is called 
		aO1.m1(); // this will change i from 10 -> 14; 
		System.out.println(a.i); //  14
		System.out.println(aO1.i); // 14
		System.out.println(aO2.i); // 14
		System.out.println(aO2.j); // 15
		//====================================
		
		aO1.m2();
		System.out.println(a.i); //  17
		System.out.println(aO1.i); // 17
		System.out.println(aO2.i); // 17
		System.out.println(aO1.j); // 18
		System.out.println(aO2.j); // 15 -> NOTE
		//========================================
		
		aO2.m2();
		System.out.println(a.i); //  17
		System.out.println(aO1.i); // 17
		System.out.println(aO2.i); // 17
		System.out.println(aO1.j); // 18
		System.out.println(aO2.j); // 18 -> NOTE
		
		/*
		 * Note: If static variable if changed, it is changed for every object. Because every 
		 * object shares the same copy of static variables. They are created only once.  
		 * 
		 * Non-static variables, also called instance variables, if changed by on object, its 
		 * value is changed for that particular object, not for the other object of that class.
		 * Because every object has its own copy of non-static variables. They are created every
		 * time the object is created.
		 */
		
	}

}
