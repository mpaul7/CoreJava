package _interface;
/*
 * A class that implements Football needs to define the three methods from Football 
 * and the two methods from Sports.
 */
public interface Football extends Sports {
	public void homeTeamScored(int points);
	public void visitingTeamScored(int points);
	public void endOfQuarter(int quarter);
	}
