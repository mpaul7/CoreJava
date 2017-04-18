package JavaBasic1;

/*
 * In class countNumberOfObjectsInClass, we saw multiple objects of class can be created.
 * 
 * Singleton Class
 * ===============
 * A class whose only one object can be created.
 * 
 *  Definition
 *  ==========
 *  
 */
class singleton{
	   private singleton(){
		   
	   }
	   private singleton st = new singleton();
	   
	  // static public singleton getString(){
		  // return;
	  // 	}
	   /*
	    * Define constructor as private.
	    * method must be public and static.
	    * we can not make the object of this class.
	    */
	   //singleton s = singleton.getString(); // it will return an object
	   
	   /*
	    *  Another variation
	    *  =================
	    *  Remove the object from class a
	    *  private singleton st = null;
	    *  
	    *  static public singleton getString ();
	    *  if (st == null){
	    *  		st = new singleton();
	    *  		return st;
	    *  	lazy activation
	    *   Note: singleton is concept not a keyword.
	    */
}
public class singletonClass {

}
