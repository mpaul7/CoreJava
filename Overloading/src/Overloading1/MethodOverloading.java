package Overloading1;

class a{
	void m1(){
		System.out.println("1");
		}
	
	void m1 (int i){
		System.out.println("2");
		}
	}

class b{
	void m1(){
		System.out.println("no parameter");
		}
	}

class c extends b{
	void m1(int i){
		System.out.println("one parameter");
		}
	}	

	class d extends c{
		void m1(String s){
			System.out.println("String parameter");
		}
	}
	//==============
	class  e{
		int x = 12;
		void m1(int i ){
			//i = x;
			x = i;
			}
		}

public class MethodOverloading {
	public static void main (String args[]){
		a aO1 = new a();
		aO1.m1(); // 1
		aO1.m1(10); // 2
		
		// =================
		/* Method overloading in multiple class
		 * There should be parent child relationship among the classes
		 * i.e. inheritance. 
		 */
		d dO1 = new d();
		dO1.m1(); // o/p no parameter
		dO1.m1(10); // o/p one parameter
		dO1.m1("a"); // o/p String parameter.
		
		// related to class e
		e eO1 = new e();
		System.out.println(eO1.x);
		//System.out.println(eO1.i); // error because i is local var
		// therefore its access type is private
		
		// if in method m1 () x = i;
		 eO1.m1(123);
		 
		 System.out.println(eO1.x);
		
	}

}
