package super1;
class a1{
	a1(){this("default cosntructor");}
	a1(String s){System.out.println("Hello String");}
	a1(int i){System.out.println("Print 10");}
	}
	


class b1 extends a1{
	b1() {
		super();
		}
	}

class c extends b1{
	c(){ }
}

public class CallConstFromConst {
	public static void main(String args [] ){
		a1 O1 = new a1(); // o/p is hello string
		/*
		 * When a1 O1 = new a1(); is executed, default constructor is called. Then a(String s) 
		 * constructor is called. 
		 * 
		 * Note: "this" is always the first statement in the body of constructor. 
		 * 
		 * Note: "super" and "this" can not be used together, because both must be the first
		 * statement. This cannot happen simultaneously. 
		 */
		
	}

}
