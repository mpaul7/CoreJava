package Constructor1;
/* 
 * Constructor has same name as that of the class name
 * It does not have a return type, since it is not a method.
 * It is technically not a member of the class. 
 * It can't be inherited or overridden. 
 * If there is no constructor in the class, then default constructor is given by the complier. 
 * If there is constructor in the class may be other than the default constructor, 
 * then default constructor is not provided by the compiler. 
 * When ever constructor of class is called implicitly, then default constructor is accessed. 
 * A constructor only initialise, does not construct anything. 
 * By default a class has only one constructor, but can have more than one constructor. 
 * 
 * When a variable is declared in a method or constructor, is by default private and can't
 * be accessed. 
 */

class a {
	int i = 10;
	/* 
	 * This is default, null or no-argument constructor, provided 
	 * either by the class or by the compiler. 
	 */
	a () {
		i = 15;
		System.out.println("from a()");
		}
		
	a (int i){
		i = 15;
		System.out.println("from a(int i)");
		}
	
	a (String s){}
	
	/*
	 * This will act as a method. Since a method name can have same name as class name. 
	 */
	
	void a () {
	    /*
	     *  Local and private variable, because it has been declared inside the method.
	     *  A local variable can have the same name as an instance variable.
	     */
 		int i = 10;
 		/* 
 		 * It i is written without declaration, then it will act like an instance variable. 
 		 */
 		i = 33;
 		System.out.println("Local var i = " + i);
	}
	}

class b extends a {
	/* 
	 *  The following line will give error, since constructor overloading is not allowed.
	 */
	//b bO1 =  new b(10);
	
	b(){
		/*
		 * Step B
		 * ======
		 * It will seek the constructor with integer as an argument.
		 */
		super(10);
		System.out.println("b");
		}
	}

class c extends b{
	
	c(){
		System.out.println("c");
	}
	
}

public class ConstructorBasic {
	public static void main(String args[]){
		a aO1 =  new a();
		aO1.a();
		
		/*
		 * When aO1.i, then constructor is called. What ever is the code in the constructor
		 * is executed. In this case i = 15; 
		 */
		
		System.out.println("Instance Var i = " + aO1.i); // o/p is 15
		
		// constructor chaining.
		//======================
		/*
		 * In the main method, an object of class c is instantiated,  
		 * Since class c has super class b, further class b has super class a. Thus control 
		 * will go to super class a. As class a does not have super class, so it will seek for 
		 * default constructor
		 * 
		 * Implicit Chaining
		 * ==================
		 * After accessing the default constructor of super class a, then the control will 
		 * go to lower class b, then to class c. 
		 * Cosntructor chaining is not overloading, rather it is a sequence. 
		 * 
		 * Note: In implicit chaining, the control always look for default constructor.
		 * if we remote the default constructor from class a, then we will get compile time 
		 * error. 
		 * 
		 * In implicit constructor chaining, the control always looks for default constructor.
		 */
		c cO1 = new c(); // o/p is a, b, c.
		
		/*
		 * Use of Super
		 * ============
		 * If a super class has no default constructor, then to get around this error, 
		 * 
		 *  go to step B in class b
		 * 
		 * Explicit Constructor Chaining
		 * =============================
		 * Using explicit chaining, constructor with any signature can be called.
		 * To change constructor chaining super keyword is used.
		 * Note: super keyword is for immediate class. 
		 * Every super class must not have default constructor.
		 * 
		 * When passing arguments then constructor with specific signatures will be explicitly 
		 * called. However, if this class is extending any other class then it will implicitly 
		 * call its own super class and its default constructor will be called.  
		 * 
		 * 		 
		 */
		
		}
	}
