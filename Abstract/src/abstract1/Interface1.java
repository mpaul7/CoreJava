package abstract1;
/*
 * Interface
 * =========
 * high level of abstraction
 * all the things are abstract
 * it can be declated inside a package 
 * 
 * Definition
 * ===========
 * inte1rface i{
 * 	int i = 10;
 * 	void m1();
 *  void m2(); // both the methods are implicitly abstract. 
 *  
 *  class a implements i1{
 *  	void m1(){}
 *  void m2(){}
 *  
 *  can not create an object, only declare the reference. 
 *  i1 O1;
 *  O1 = new a();
 *  
 *  this reference refer to implementation of class a. 
 *  
 *  No constructor with in the interface. 
 *  
 *  Variables
 *  =========
 *  
 *  1. variables inside interface is by default public, final and static. 
 *  2. All methods are public and abstract
 *  3. no static method is the interface. 
 *  
 *  Inheritance
 *  ===========
 *  1. code inheritance
 *  inheritance of interface of interface you are only inheriting what to do, you are 
 *  extending abstract class.
 *  
 *   Multiple Inheritance
 *   ====================
 *   Multiple inheritance is not possible in java. 
 *   Multiple interface is possible. In this case code is not inherited, only the behaviour.  
 *   class a extends b, c, d  -> error.
 *   
 *   class a extends b implements i1, i2, i3  -> multiple interface is possible
 *   Note: in this case b has to provide all the implementations of these classes.
 *   
 *   interface can extend another interface
 *   ======================================
 *   interface i1(){}
 *   interface i2 extend i1, i3, i4.
 *   
 *   interface can be implemented by a class
 *   =======================================
 *   interface i1{
 *   	int i = 10;
 *   	}
 *   	interface i2{
 *      	int i = 12;
 *      	}
 *  class a implements i1
 *  public static void main (String args[]){
 *  System.out.println(i) 
 *  no need of object to access variable i
 *  since by default variables in an interface are public static final
 *  
 *  if class a implements i1, i2
 *  systems.out.println(i) -> ambiguity, because both the interface have same priority
 *  
 * so systems.out.println(i1.i)
 * 
 * class inside an interface
 * ==========================
 * interface i1{
 * 	void m1();
 * 	void m2();
 * class a implements i1{
 * 	void m1(){}
 *  void m2(){}
 *  
 *    public static void main (String args[]){
 *    	System.out.println("a")}
 *    
 *    
 * 
 */
public class Interface1 {

}
