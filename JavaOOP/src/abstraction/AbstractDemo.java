package abstraction;


public class AbstractDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
// abstract class can not be instantiated
		
		// Employee e1 = new Employee();  // error 
		/* 
		 * When object of salary class is instantiated, then it will inherit all the fields and 
		 * methods of the Employee class
		 */
		Salary s = new Salary();
		Employee e = new Salary();
		
		e.emp_method1(); // output = emp_method1() from Salary class
		e.emp_method3(); // output = override abstract method emp_method3() from Employee

	}

}
