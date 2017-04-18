package parking;

import java.util.Scanner;
//import java.util.TreeMap;

public class Entrance extends Parking  {
	private static Parking pkg = null;	
		
	public static void main(String[] args) {
		ParkingSpace.initializeParkingSpaces();
		pkg = new Entrance();
			 	
		while(true){
			System.out.println("Press y to park, u to unpark");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			String s = in.next();
		
			
			if (s.equals("y") && ParkingSpace.isSpaceAvailable()){ // s == "y" will not work1				
					System.out.println("Parking Available");
					pkg.park();
				}else if (s.equals("u")){
					pkg.unpark();
				}else System.out.println("No Parking Available");
			}
		}
	
	@Override
	public void park() {
		Integer token = ParkingSpace.getSpaceAvailable();
		System.out.println("parking : " + token);
		ParkingSpace.setSpaceAllotment(token, new Parker(System.currentTimeMillis()), true);
		ParkingSpace.setSpaceAvailable(token, true);
		
		}
	
	@Override
	public void unpark() {
		Integer token = ParkingSpace.getSpaceAllotment();
		System.out.println("unparking : " + token);
		ParkingSpace.setSpaceAvailable(token, false);
		ParkingSpace.setSpaceAllotment(token, ParkingSpace.spaceAllotment.get(token), false);
		}

}
