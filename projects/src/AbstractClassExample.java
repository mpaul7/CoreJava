abstract class Shape {
	   private String color;
	   
	   public Shape (String color) {
	      this.color = color;
	   }
	   
	   public String toString() {
	      return "Color of Shape =\"" + color + "\"";
	   }
	   
	  /* An abstract method --> cannot be final, as final method cannot be overridden.
	   * An abstract method --> cannot be private, as  private method are not visible to the subclass and thus cannot be overridden.
	   * (which generates a compilation error). 
	   *  
	   * All Shape subclasses must implement a method called getArea()*/
	   
	   abstract public double getArea();
	   
	  /* public void helloShape(){
		   System.out.println("Hello Shape");
	   }*/
	}

class Rectangle extends Shape{
	int x; 
	int y;
	public Rectangle(String color, int x, int y) {
		super(color);
		this.x = x;
		this.y = y;
		}
	@Override
	public double getArea() {
		return x*y;
		}
	public void helloShape(){
		   System.out.println("Hello Rectangle");
	   }
	}

class Triangle extends Shape{
	int x; 
	int y;
	public Triangle (String color, int x, int y){
		super(color);
		this.x = x;
		this.y = y;
	}

	public double getArea() {
		return 0.5*x*y;
		}
	}

public class AbstractClassExample {
	public static String s;
	public static void main(String[] args) {
		/*while(true){
		Scanner in = new Scanner(System.in);
		s = in.next();
		System.out.println(s);
		}*/
		Shape s1 = new Rectangle("red", 4, 5);
		//s1.helloShape();
		System.out.println(s1);
		System.out.println("Area is " + s1.getArea());
		
		Shape s2 = new Triangle("blue", 4, 5);
		System.out.println(s2);
		System.out.println("Area is " + s2.getArea());
		}
	
	/*An abstract class is incomplete in its definition, since the implementation of its abstract methods is missing. 
	 * Therefore, an abstract class cannot be instantiated. In other words, you cannot create instances from an 
	 * abstract class (otherwise, you will have an incomplete instance with missing method's body).
	 * To use an abstract class, you have to derive a subclass from the abstract class. In the derived subclass, 
	 * you have to override the abstract methods and provide implementation to all the abstract methods. 
	 * The subclass derived is now complete, and can be instantiated. (If a subclass does not provide implementation 
	 * to all the abstract methods of the superclass, the subclass remains abstract.)
	 * 
	 * This property of the abstract class solves our earlier problem. In other words, you can create instances of the 
	 * 	subclasses such as Triangle and Rectangle, and upcast them to Shape (so as to program and operate at the interface level),
	 * 	but you cannot create instance of Shape, which avoid the pitfall that we have faced.
	 * 
	 * Rule of Thumb: Program at the interface, not at the implementation. That is, 
	 * 1. make references at the superclass; 
	 * 2. substitute with subclass instances; and 
	 * 3. invoke methods defined in the superclass only.
	 * */ 
}
