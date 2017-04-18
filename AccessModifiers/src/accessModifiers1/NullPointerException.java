package accessModifiers1;

/*
 *  pointers are there internally in java internally. 
 */

public class NullPointerException {
	int i = 10;
	// we are creating a reference of the class but not storing it; This points to null. 
	NullPointerException O1;
	
	public static void main (String args[]){
		// System.out.println(O1.i); // gives error. 
	}
}
