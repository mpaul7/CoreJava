package accessModifiers1;

/* import
 * ======
 * import p1.*;
 * Note: source code is not copied only pointer is copied. i.e. only the symbolic reference
 * is copied not the source code. 
 * =======================================================================
 * 
 *  package p1; 							package p2;
 *  ===========								=========== 
 *  If there are 100 copies of class		import p1.*;
 *  and only two are being used, then 		public class c extends a
 *  only two will be copied. 				public static void main ()
 *  										a O1 = new a();
 *  										b O1 = new b();
 *  
 *  class a{ }								class c{ }
 *  public class b {}						class a is not available here
 *  										public class b is available here	
 *  there is no access modifier 
 *  before class a, so the default
 *  modifier is private. Thus this
 *  class is not available outside the
 *  current package. 
 */											 

public class packageBasics {

}
