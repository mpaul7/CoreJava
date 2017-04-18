package _interface;

public class DemoInterface implements Hockey {
	/*
	 * This class implements Hockey interface, which further implements Football, which further
	 * implements Sports. Thus this class has to override all the methods from these interfaces. 
	 * 
	 * If a class is abstract, then there is no need to override abstract methods.
	 * see DemoInterface2 class
	 */

	@Override
	public void setHomeTeam(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVisitingTeam(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void homeGoalScored() {
		// TODO Auto-generated method stub

	}

	@Override
	public void visitingGoalScored() {
		// TODO Auto-generated method stub

	}

	@Override
	public void endOfPeriod(int period) {
		// TODO Auto-generated method stub

	}

	@Override
	public void overtimePeriod(int ot) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
