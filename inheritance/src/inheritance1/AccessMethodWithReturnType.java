package inheritance1;

class a{
	int i = 12;
	/*If a method has return type, then it can be called through SOP.
	 * If a method is void, then it will give error. 
	 */
	int m1(){
		return i;
		}
	void m2(){
		
		}
	}

public class AccessMethodWithReturnType {
	public static void main(String args[]){
		a aO1 = new a();
		System.out.println(aO1.m1());
		//System.out.println(aO1.m2()); // Method calling without return type through SOP
		/* The method println(boolean) in the type PrintStream is not
		 * 	 *  applicable for the arguments (void)
		 * 	 */
		}
	}
