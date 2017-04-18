package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CalculatorClient {
	
	public static void main(String[] args){
		try {
			CalculatorInterface c = (CalculatorInterface)Naming.lookup ("rmi://localhost/CalculatorService");
			System.out.println( c.sub(4, 3) ); 
            System.out.println( c.add(4, 5) ); 
        } catch (MalformedURLException murle) { 
            System.out.println("MalformedURLException");
            } catch (RemoteException re) {
            	System.out.println("RemoteException");
            	} catch (NotBoundException nbe) {
            		System.out.println("NotBoundException");
            		} catch (java.lang.ArithmeticException ae) {
            			System.out.println("java.lang.ArithmeticException");
            			}
		}
	}
