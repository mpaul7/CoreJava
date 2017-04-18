package JavaBasic1;
/*
 * equals
 * ======
 *  is a method of Object class
 *  "==" is operator.
 *  Equality on two basis
 *  1. Two objects are considered equal if they are pointing to same memory
 *  2. If their contents are same.  
 */
public class Equals {
	int i = 10;
	int j = 15;
	
	Equals O1 = new Equals();
	Equals O2 = new Equals();
	
	/*
	 * if(O1==O2) -> false.
	 * if a O2 = O1;
	 * Now both the objects are pointing to the same memory location. In this case
	 * if(O1==O2) -> True. 
	 */
	//========================================
	/*
	 * Code of equals method in Object class
	 * ======================================
	 * boolean equals (Object O1){
	 * return this == O1;
	 * 
	 * Ssytem.out.println(O1.equals(O2))
	 * Now O2 is passed to object of equals method. O1 ==O2.
	 * Note: "==" and equals method of object class yields same result. 
	 * Note: If equals method is overridden then this checks for contents not the meomory 
	 * location. 
	 * 
	 * Wrapper classes
	 * ===============
	 * 
	 * Exception: In wrapper classes equals method checks for contents. 
	 */
	public static void main(String args[]){
		Integer i1 = new Integer (10);
		Integer i2 = new Integer(10);
		System.out.println("i1 == i2  =  " + (i1 == i2));  // o/p is false.
		// op is false, because it checks for the memory location .
		System.out.println("i1.equals(i2)  =  " + i1.equals(i2)); // o/p is true
		/*
		 * Note: if the equals method is overridden then it checks for the contents. 
		 */
		//=======================================
		/*
		 * 1. "==" checks for memory location
		 * 2. Object class's equals method checks for memory location
		 * 3. In wrapper classes equals method checks for contents
		 * 4. If equals method is overridden, then it checks for contents. 
		 */
	}

}
