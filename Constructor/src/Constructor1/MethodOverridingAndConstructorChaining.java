package Constructor1;
class a1 {
	a1(){p();}
	void p(){
	   System.out.println("a1");
	   }
	}
class b1 extends a1 {
	b1(){p();}
	void p(){
	    System.out.println("b1");
	    }
	}
class c1 extends b1{
	c1(){p();}
	void p(){
	    System.out.println("c1");
	    }
	}
public class MethodOverridingAndConstructorChaining {
	public static void main (String args[]){
	    c1 cO1 = new c1();}} // o/p is c1, c1, c1.

