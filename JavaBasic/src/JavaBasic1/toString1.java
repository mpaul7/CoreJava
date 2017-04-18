package JavaBasic1;

public class toString1 {
	
	static toString1 O1 = new toString1();
	//toString1 O2 = new toString1();
	int i, j;
	
	//String toString(){
		
	//}
		
	
	public static void main (String args[]){
		System.out.println(O1); //JavaBasic1.toString@47415dbf
		// or
		System.out.println(O1.toString()); // JavaBasic1.toString@47415dbf
		/*
		 * toString -> is string representation of an object.Means the state of object. 
		 * value of variable
		 * 
		 * a@memory address of the object called hash code. 
		 * Return type of toString is string
		 * 
		 * When we pass object O1 to println then toString method of the object class
		 * is called implicitly. 
		 * Internally it is like
		 * System.out.println(O1.toString()); 
		 */
	}
}