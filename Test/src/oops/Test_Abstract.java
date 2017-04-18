package oops;

abstract class Animalaa{
	
	public abstract void m1();
	
}

public class Test_Abstract extends Animalaa {

	@Override
	public void m1() {
		System.out.println("From Test_Abstract");
		
	}
	
	public static void main(String[] args) {
		
		Test_Abstract b = new Test_Abstract();
		Animalaa a = new Test_Abstract();
		
		a.m1();
		b.m1();
	}
	

}
