package operators;

public class IsInstance {

	
	public static void main(String[] args) throws Exception {
		Thread t = new Thread();
		//System.out.println(Class.forName(args[0]).isInstance(t));
		System.out.println(t instanceof Thread); // true
		System.out.println(t instanceof Object); // true
		System.out.println(t instanceof Runnable); // true
		//System.out.println(t instanceof String); // true
	}

}
