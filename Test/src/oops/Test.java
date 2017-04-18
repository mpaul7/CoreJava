package oops;

//class Animal1{
//	public void move (){
//		System.out.println("Animal1 Class");
//		}
//	}

class Animal {//extends Animal1{
	private int x ;
	public void move (){
		System.out.println("Animal Class");
		}
	
	public int getX(){
		return x;
	}
	}

class Dog extends Animal{
//	public void move (){
//		//super.move();
//		System.out.println("Dog Class");
//		}
	
	public void bark(){
		System.out.println("Dog bark");
	}
	}

public class Test {
	public static void main(String[] args) {

		Dog d = new Dog();
	//	d.move();
		Animal a = new Animal();
		Animal b = new Dog();
			//a.move();
			b.move();
			//b.bark();
		System.out.println(d.getX());
		}
	}
