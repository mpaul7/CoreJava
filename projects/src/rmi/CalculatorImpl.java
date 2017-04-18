package rmi;

import java.rmi.RemoteException;

public class CalculatorImpl implements CalculatorInterface {

	@Override
	public long add(long a, long b) throws RemoteException {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public long sub(long a, long b) throws RemoteException {
		// TODO Auto-generated method stub
		return a-b;
	}
}
