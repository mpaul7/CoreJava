
 class Shape3 {
	   public String color;
	   public Shape3(){}
	   public Shape3 (String color) {
		   this.color = color;
		   }
	   
	   public String toString() {
		   return "Color of Shape =\"" + color + "\"";
		   }
	   
	   // All Shape subclasses must implement a method called getArea()
	   // All shapes must has a method called getArea()
	   public double getArea() {
	      System.err.println("Shape unknown! Cannot compute area!");
	      return 0;   // Need a return to compile the program
	   }
	   }

class Triangle3 extends Shape3{
	int x; 
	int y;
	public Triangle3 (String color, int x, int y){
		super(color);
		this.x = x;
		this.y = y;
		}

	public double getArea(){
		return 0.5*x*y;
		}
	}

class Rectangle3 extends Shape3{
	int x; 
	int y;
	public Rectangle3(String color, int x, int y) {
		super(color);
		this.x = x;
		this.y = y;
		}
	
	public double getArea(){
		return x*y;
		}
	}

public class InheritanceExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape3 s1 = new Shape3("Violet");
		s1.getArea();
	
		Rectangle3 s4 = new Rectangle3("red", 4, 5);
		//Shape3 s4 = new Rectangle3("red", 4, 5);
		System.out.println(s4);
		System.out.println("Area is " + s4.getArea());
		
		//Triangle3 s2 = new Triangle3("blue", 4, 5);
		Shape3 s2 = new Triangle3("blue", 4, 5);
		System.out.println(s2);
		System.out.println("Area is " + s2.getArea());
		
		/*The beauty of this code is that all the references are from the superclass (i.e., programming at the interface level). 
		 * You could instantiate different subclass instance, and the code still works. You could extend your program easily by 
		 * adding in more subclasses, such as Circle, Square, etc, with ease.
		 * 
		 * Nonetheless, the above definition of Shape class poses a problem, if someone instantiate a Shape object and invoke 
		 * the getArea() from the Shape object, the program breaks.
		 * 
		 * This is because the Shape class is meant to provide a common interface to all its subclasses, which are supposed to 
		 * provide the actual implementation. We do not want anyone to instantiate a Shape instance. This problem can be resolved 
		 * by using the so-called abstract class.*/
		
		}
}
