/*
 * All methods in an interface shall be public and abstract (default). 
 * You cannot use other access modifier such as private, protected and default, or modifiers such as static, final.
 * All fields shall be public, static and final (default).
 * An interface may "extends" from a super-interface.
 * */


interface Shape1 {
	 public static final String color = null; // all the fields are by default constant. 
	 String color2 = null; // Whether we mention public static final, it is by default constant. 
	 
	   // All Shape subclasses must implement a method called getArea()
	   public double getArea();
	   }

class Rectangle1 implements Shape1{
	String color;
	int x; 
	int y;
	public Rectangle1(String color, int x, int y) {
		//super(color);
		this.color = color;
		this.x = x;
		this.y = y;
		}
	@Override
	public double getArea() {
		return x*y;
		}
	}

class Triangle1 implements Shape1{
	String color;
	int x; 
	int y;
	public Triangle1(String color, int x, int y){
		//super(color);
		this.color = color;
		this.x = x;
		this.y = y;
	}

	public double getArea() {
		return 0.5*x*y;
		}
	}
public class InterfaceExample {
	
	
	public static void main(String[] args){
		//Rectangle1 s1 = new Rectangle1("red", 4, 5);
		Shape1 s1 = new Rectangle1("red", 4, 5);
		//Shape1.color2 = "violet";
		System.out.println(s1.color);
		System.out.println("Area is " + s1.getArea());
		
		//Triangle1 s2 = new Triangle1("blue", 4, 5);
		Shape1 s2 = new Triangle1("blue", 4, 5);
		System.out.println(s2.color);
		System.out.println("Area is " + s2.getArea());
	}

}
