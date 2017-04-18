package This1;
/*
 * this - always point to current object. 
 */

class a{
	int i = 10;
	int m , n;
	 a(){}
	
	a(int m, int n){
		//m = m;
		//n = n;
		this.m = m;
		this.n = n;
	}
	void m1(){
		this.m2();
		//=======
		int i = 10; // local variable
		i = 15;
		//this.i = 15;
		}
	 
	void m2(){
		System.out.println("from m2()");
		}
	}

public class ThisBasic {
	
	public static void main (String args[]){
		a aO1 = new a();
		aO1.m1(); 
		/*
		 * When m1() is called, then m2() is also called. Actually, internally it is like: 
		 * aO1.m2(); 
		 * When this keyword is put before m2(), then "this" is also pointing to aO1.
		 * Because "this" always points to the current object.   
		 */
		//======================================================
		System.out.println(aO1.i); // without "this" the out put is 10;
		/*
		 * when aO1.i;
		 * When there is no "this" before variable i in m1(), then the variable acts like a 
		 * local variable. Therefore System.out.println(aO1.i); will return 10.
		 * 
		 * When "this" is before variable i in method m1(); then implicitly "this" will point 
		 * to the object that is calling m1(), in this case it is aO1. 
		 * 
		 * So it will be aO1.i = 15. Thus, it will change the instance variable i from 10 -> 15.
		 * System.out.println(aO1.i) will return 15. 
		 */
		//=================================================
		
		a aO2 = new a(10, 15);
		System.out.println(aO2.m); // o/p is 0
		System.out.println(aO2.n); // o/p is 0
		/*
		 * The output is zero, since it is calling only the instance variables. It has nothing 
		 * do with the constructor.
		 * 
		 * If "this" is put before the variables in the constructore, like 
		 * this.m = m;
		 * this.n = n;
		 * Actually it is like: 
		 * aO2.m = m;
		 * aO2.n = n;
		 * 
		 * In this case the instance variables will be changed to 10 and 15. 
		 * 
		 * 
		 */
		
		
	}
	
}
