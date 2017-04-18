package _interface;
/*
 * The Hockey interface has four methods, but it inherits two from Sports; 
 * thus, a class that implements Hockey needs to implement all six methods.
 */
public interface Hockey extends Sports {
	public void homeGoalScored();
	public void visitingGoalScored();
	public void endOfPeriod(int period);
	public void overtimePeriod(int ot);
	}
