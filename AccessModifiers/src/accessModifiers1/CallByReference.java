package accessModifiers1;

class a1 {
	int i = 15;
	void m1(a1 O1){
		O1.i = 100;
		O1 = null;
		}
	}
/*
 * Reference is just a pointer to the object. There can be several references to the 
 * same object.
 */
public class CallByReference {
	public static void main(String args[]){
		CallByReference O1 = new CallByReference();
		a1 O2 = new a1();
		a1 O3 = new a1();
		/*
		 * passing reference. So copy of reference is made. 
		 * So O1 will also point to same as O2. 
		 */
		O2.m1(O2);
		System.out.println(O2.i); // 100
		System.out.println(O3.i); // 15
	}
}
