package super1;

/*
 * super refers to super class (top class)
 * super(); -> syntex
 * It refers to only immediate super class. 
 * 
 */
class aa{
	int i = 10;
	}
class a extends aa {
	//int i = 10;
	
	a(){}
	a(int i){
		System.out.println("hello");
		}
	}

class b extends a{
	int i = 10;
	
	b(int i) {
		super(10);
		}
	
	void m1() {
		int j = super.i;
		System.out.println(j);
	}
	/*
	 * If variables are of same name, i.e. "i" hiding "i", then user super. 
	 * This means, when there is overriding or data hiding, then we use super. 
	 */
	}

public class SuperBasic extends a {
	public static void main (String args[]){
		//b bO1 = new b(10);
		//bO1.m1(); // o/p is 10
		/*
		 * super first checks the immediate super class. If the immediate super class does not 
		 * have that variable, the control checks in further super class. 
		 */
		b bO2 = new b(10);
	}
	/*
	 * Note: if super is not there, then super is inserted by the compiler by default
	 */

}
