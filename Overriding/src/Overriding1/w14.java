package Overriding1;

class Super{
	int i = 15;
	void m1(){
		System.out.println("Super");
		}
	}

class child extends Super{
	int i = 12;
	void m1(){
		System.out.println("child");
		}
	}


public class w14 {
 public static void main(String args[]){
	 child cO1 = new child();
	 Super sO1 = new Super(); 
	 /*As child class extends Super, there the child class has two 
	  * m1() methods. If m1() is called with the object of Child class, 
	  * then it will return "child". If it is called with the object of 
	  * Super class then it will return "Super". 
	  */
	 cO1.m1();// o/p is child
	 sO1.m1();// o/p is Super
	 //============================
	 child cO2 = new child();
	 Super sO2 = new Super();
	 // parent class can always hold child class reference 
	 // This is called run-time Polymorphism.
	 sO2 = cO2;
	 sO2.m1(); // o/p is child
	 
	 //============================
	 /* In case of calling an instance variable, it is the reference
	  * that decides which variable to call. 
	  */
	 // here reference if of class Super, but object is of class child
	 // because p = c
	 Super sO3 = new child();
	 sO3.m1(); // o/p child 
	 System.out.println(sO3.i); // o/p is 15 not 12
	 }
 }
