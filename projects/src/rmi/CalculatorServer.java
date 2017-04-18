package rmi;

import java.rmi.Naming;

public class CalculatorServer {

	public CalculatorServer(){
		try{
			CalculatorInterface c = new CalculatorImpl();
			Naming.rebind("rmi://localhost:1099/CalculatorService", c);
		}catch (Exception e) {
			System.out.println("Trouble :  " + e);
		}
	}
	
	public static void main(String[] args) {
		new CalculatorServer();
	}
}
