package abstraction;

// abstract class can not be instantiated.
// abstract class can be extended. See Salary class it is extending Employee class
public abstract class Employee {
	
	private String name;
	private String address;
	
	public Employee(){
		
	}

	public void emp_method1(){
		System.out.println("emp_method1() from Employee class");
		}
	
	public void emp_method2(){
		System.out.println("emp_method2() from Employee class");
		}
	
	//An abstract method consists of a method signature, but no method body.
	/*
	 * Declaring a method as abstract has two results:
	 * If a class contains an abstract method, the class must be abstract as well.
	 * Any child class must either override the abstract method or declare itself abstract.
	 * 
	 * Got the error, when this method was not overridden in the salary class
	 * Error : The type Salary must implement the inherited abstract method Employee.emp_method3()
	 * go to ===== A =====
	 */
	abstract void emp_method3();
	
	/* A child class that inherits an abstract method must override it. 
	 * If they do not, they must be abstract and any of their children must override it.
	 * Go to class Salary2 class, it extends Employee class but do not override abstract method.
	 * But Salary2 class is declared abstract. 
	 */
	
	
	
}
