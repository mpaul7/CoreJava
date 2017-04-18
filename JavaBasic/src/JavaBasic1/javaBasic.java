package JavaBasic1;

/*
 * int i = 10;
 * int ->  is data type; i -> is variable; 10 -> is value;
 * Data type decides which value the variable can contain
 * Data type decides which operations can be performed on it. 
 * 
 * ADT: Abstract Data Type
 * Range of integer is from -inf to + inf
 * In computer -2e31 to 2e31-1; one bit is for sign bit, whether + or -. 
 *  
 */
class a {
	int  i = 10;
	void m1(){
		System.out.println("a");
		}
	void m2(){
		System.out.println("m2");
		}
	}
class b extends a {
	int  i = 12;
	void m1(){
		System.out.println("b");
		}
	void m3(){
		System.out.println("m3");
		}
	}
class c extends b {
	int  i = 14;
	void m1(){
		System.out.println("c");
		}
	
	}
public class javaBasic {
	public static void main(String args[]){
		a aO1 = new a();
		aO1.m1(); // a
		aO1.m2(); // m2
		System.out.println("aO1.i = " + aO1.i);
		
		a aO2 = new b();
		aO2.m1(); // b
		aO2.m2(); // m2
		System.out.println("aO2.i = " + aO2.i);
		
		a aO3 = new c();
		aO3.m1(); // c
		System.out.println("aO3.i = " + aO3.i);
		/*
		 * Here the object decides which method to call. 
		 * Super class reference can hold child class reference
		 * P = C
		 * 
		 * The method must be present in super class when P = C. 
		 * If method is present in sub class, it must be present in super class. 
		 * 
		 * a aO1 = new b();
		 * aO1.m3(); ----> will give error. 
		 * 
		 *  Object is of class b, but reference is of class a. 
		 *  Note: It is the reference that decides what all things can we do on object of b. 
		 *  since m3() is not present in class a. We can use things of class a  not of b. 
		 *  
		 *  Note: in P = C rule
		 *  m1() in class a -> of a
		 *  m1() in class b and a  -> of b
		 *  m1() in b only -> error. 
		 *  
		 *   Note: by default all methods are virtual until declared them as final. 
		 *   ============================================================================
		 *   aO1.i -> 10
		 *   aO2.i -> 10
		 *   aO3.i -> 10
		 *   
		 *   This is just reverse of the previous concept. Because variables are not 
		 *   polymorphic. Only methods are polymorphic. 
		 */
		//==================================================================================
		//==================================================================================
		
		/*
		 * varaibles are not overridden, only there is data hiding. 
		 * Note: if int m = 10 is not in class a, then
		 * a aO1 = new b();
		 * aO1.i -> will give error. 
		 * It is the reference that decides for a variable. If "m" is not in class a then 
		 * error. "m" must be present in the refernce type. 
		 */
	}
}
