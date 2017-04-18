package Overriding1;
import overriding.*;

public class MainClass2 extends MainClass {
	
	public void method1(){
		System.out.println("method1() from SuperClass");
		}
     
	private void method3(){
		System.out.println("method3() from SuperClass");
		}

	final void method4(){
		System.out.println("method4() from SuperClass");
		}
	
	
	public static void method5(){
		System.out.println("method5() from SuperClass");
		}
	
	private void method6(){
		System.out.println("method6() from Superclass");
		}
	
	protected void method7(){
		System.out.println("method7 from SuperClass");
		}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
