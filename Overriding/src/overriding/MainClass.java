package overriding;

class SuperClass{
	public void method1(){
		System.out.println("method1() from SuperClass");
		}
     // =========== A ================
	/*The access level cannot be more restrictive than the overridden method's access level. 
	 * For example: if the superclass method is declared public then the overridding method in 
	 * the sub class cannot be either private or protected.
	 * Let the following method3 is private, and method3 in ChildClassA is pbulic, which is not allowed
	 * To see the effect got to comment A in the MainClass
	 */
	private void method3(){
		System.out.println("method3() from SuperClass");
		}
	
	// =========== B ===============
	/* A method declared final can not be overridden
	 * 
	 */
	final void method4(){
		System.out.println("method4() from SuperClass");
		}
	
	// =========== C ===============
	/*
	 * A static method can not be overridden
	 */
	public static void method5(){
		System.out.println("method5() from SuperClass");
		}
	// ========== D ==============
	/*
	 * If a method cannot be inherited, then it cannot be overridden.
	 */
	
	// ============= E ==========
	/*
	 * A subclass within the same package as the instance's superclass can override any 
	 * superclass method that is not declared private or final.
	 */
	private void method6(){
		System.out.println("method6() from Superclass");
		}
	
	// =========== F ==============
	/*
	 * protected method can be overridden 
	 */
	protected void method7(){
		System.out.println("method7 from SuperClass");
		}
	
	}

class ChildClassA extends SuperClass{
	
	public void method1(){
		System.out.println("method1() from ChildClassA");
		}
	
	public void method2(){
		System.out.println("method2() from ChildClassA");
		}
	public void method3(){
		System.out.println("method3() from ChildclassA");
		}
	//=========== B ============
	// the error is - can not override final method from the SuperClass.
	/*public void method4(){
		System.out.println("method4() from ChildClassA");
		}*/
	
	// ========= C ============
	// the error is - can not override static method from the Superclass
	/*public void method5(){
		System.out.println("method5() from ChilClassA");
	}*/
	
	// =========== E ==========
	private void method6(){
		System.out.println("method6() from ChildClassA");
		}
	// ======== F ============
	protected void method7(){
		System.out.println("method7() from ChildClassA");
		}
	}

public class MainClass {
	public static void main(String[] args) {
	SuperClass SC = new SuperClass(); // SuperClass reference and Object
	SuperClass CCA = new ChildClassA(); // Super Class reference but ChildClassA() reference.
	ChildClassA CCA2 = new ChildClassA();
	SC.method1();
	// When calling a variable or a method, it is the object that decides which method to call. 
	// That is why the method1 of ChildClassA is called. 
	CCA.method1();
	//CCA.method2(); // uncomment this and see the effect. 
	// This program will throw a compile time error, 
	//since ChilClassA's reference type SuperClass doesn't have a method by the name of method2().
	//if we do the following, then there is no error
	CCA2.method2();
	
	// ========= A =============
 	//CCA.method3();// the error is that the method3 from the Superclass is not visible to the ChildClass
	
    // ========== E ============
	// the error is that the method6() from the Superclass is not visible to the ChildClass
	// CCA.method6(); 
	
	// ========== F ==========
	CCA.method7(); // no error
	
	// ========== G ==========
	/*
	 * A subclass in a different package can only override the non-final methods declared 
	 * public or protected.
	 * 
	 *Go to class Mainclass2 in package "Overriding1"  and see the overridden methods 
	 */
	
	}
}

