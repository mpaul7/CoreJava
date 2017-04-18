package accessModifiers1;

/*
 * Access Modifiers (in ascending order)
 * ===================================
 * private
 * protected
 * package (default)
 * public
 * 
 * 
 * class a{
 *   int i = 10;
 *   }
 *   
 *   class b{ }
 * 
 * Can class b use the variables of class a. It depends on the access modifiers. 
 * 
 * If class is public, then only class is public, not its instance variables.
 * 
 * private
 * ========
 * private variables can be used within the class, not outside the class.
 * not with inheritance 
 * inner class can use private variables of class
 * cannot be access in another package. 
 * 
 * package
 * =======
 * package - is  an access modifier, but do not have any keyword.
 * variables without access modifiers have package scope. 
 * package is a set of related class
 * package introduces a naming scope. 
 * 
 * package <name>;  is the very first statement. Comments can proceed it. 
 * If package name is not defined in a class, then the class gets anonymous or default package.
 * 
 * protected
 * =========
 * within the same scope of package or of any other package, but that should be subclass 
 * 
 * default
 * ========
 * with in the same package, i.e. in any class within the package. 
 * no scope in another package. 
 * 
 * public
 * ======
 * to access in another package, class need not be sub-class. 
 */

class a {
	int i = 12;	
}
// go to public class AccessModifier2 class, to see how to extend class from anther package.
public class AccessModifiersBasics {
	protected int  i = 15;
	public static void main(String args[]){
		System.out.println("a");
	}
}
