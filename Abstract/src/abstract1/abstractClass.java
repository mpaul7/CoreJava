package abstract1;

/*
 * abstract : is a keyword. 
 * something that is not completely implemented.
 * To reduce the complexity, we reduce the abstraction 
 * We have to define what to do and how to do to subclass.
 * i.e. this is what my class has to do  this is by abstract method by polymorphism.
 * We have to provide each and every method in subclass.
 * 
 *   syntactical meaning
 *   ===================
 *   It is not a concrete class
 *   can not create object of this class.
 *   it may have concrete objects. 
 *   abstract method have no body. 
 *   functionality of concrete method can be defined by reference of class that we want to 
 *   share with subclass.
 *   
 *   low level abstraction
 *   =====================
 *   it can have concrete methods also 
 *   
 *   abstract class a(){
 *   	abstract void m1(){}
 *   	abstract void m2(){} 
 *   class b extends a{
 *   	void m1(){}
 *   	void m2(){}
 *   
 *   Cannot create object but can declare reference of this abstract class. 
 *   a O1;
 *   a O1 = new a(); -> error
 *   but we can  a O1 = new b(); -> P = C
 *   
 *   If we do not want to implement all the functionality i.e. all the methods of abstract class.
 *  
 *    abstract class a {
 *    	abstract void m1(){}
 *    	abstract void m2 (){}
 *    	
 *    abstract class b extends a 
 *    	void m1(){}
 *   	void m2(){}
 *   	void m4{m3()}
 *   class c
 *   	b O1 = new b();
 *   	O1.m4();
 */		

/*
 * m3() method can not be used directly because we can not make object of abstract class.
 * 
 * Inside a abstract class we can have static method, we can call it by reference of class.
 * 
 * No variable as abstract
 * ========================
 * 
 * abstract class a{
 * 	abstract void m1()
 * 	abstract void m2()
 * }
 * 
 * abstract class b extends a{
 * 	abstract void m3()
 *  abstract void m4()
 *  }
 *  
 *  class c extends b{
 *  void m1(){}
 *  void m2(){}
 *  void m3(){}
 *  void m4(){}
 */

public class abstractClass {

}
