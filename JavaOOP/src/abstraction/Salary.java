package abstraction;

// Salary class extending Employee class
public class Salary extends Employee {
	
	private double salary;
	public Salary (){
		
	}
	
	public void emp_method1(){
		System.out.println("emp_method1() from Salary class");
		}
	// an abstract method in the super class must be overridden. 
	// ====== A =======
	void emp_method3(){
		System.out.println("override abstract method emp_method3() from Employee");
		
	}

}
