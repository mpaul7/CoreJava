package parking;

public class Parker {
	
	long token, time_in, time_out, spaceAlloted; 
	
	
	public Parker(long time_in){
		//this.token = token;
		this.time_in = time_in;
		}


	@Override
	public String toString() {
		//return "Parker [time_in=" + time_in + "]";
		return " " + time_in + " ";
	}
	
	

}
