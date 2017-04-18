package parking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ParkingSpace {
	
	//private static TreeMap<Integer, Boolean> spaceAvailable = new TreeMap<Integer, Boolean>();
	private static ArrayList<Integer> spaceAvailable = new ArrayList<Integer>();
	public static TreeMap<Integer, Parker> spaceAllotment = new TreeMap<Integer, Parker>();
	
	// Initialize the parking space
	public static void initializeParkingSpaces(){
			for(int i = 101; i < 105; i++){
			spaceAvailable.add(i);
			}
		iterateOverList(spaceAvailable);
		}
	
	public static boolean isSpaceAvailable(){
		if(spaceAvailable.isEmpty()) return false;
		return true;
		}

	public static Integer getSpaceAvailable() {
		System.out.println(spaceAvailable.get(0));
		return spaceAvailable.get(0);
		}

	public static void setSpaceAvailable(Integer token, boolean p_up) {
		if (p_up)
			spaceAvailable.remove(token);
		else spaceAvailable.add(token);
		iterateOverList(spaceAvailable);
		}

	public static Integer getSpaceAllotment() {
		return spaceAllotment.firstKey();
		}

	public static void setSpaceAllotment(Integer token, Parker pkr, boolean p_up) {
		if(p_up)			
		spaceAllotment.put(token, pkr);
		else spaceAllotment.remove(token);
		iterateOverMap(spaceAllotment);
		}
//=========================================================================
	// iterate over ArrayList
	 public static  void iterateOverList(ArrayList<Integer> al) {
		    Iterator<Integer> itr = al.iterator(); 
		  while(itr.hasNext()){
			  System.out.println(itr.next());
			  }
		  }
	 
	// iterate over TreeMap
	 private static <K, V> void iterateOverMap(Map<K, V> map) {
		    for (Map.Entry<K, V> entry : map.entrySet()) {
		        //System.out.println("key ->" + entry.getKey() + ", value->" + entry.getValue());
		        System.out.println(entry.getKey() + "-> " + entry.getValue());
		    }
		    }

	/*public static void main(String[] args){
		ParkingLot prkLot = new ParkingLot();
		prkLot.setSpaceAvailability();
		System.out.println(prkLot.getSpaceAvailability());
		
	}*/

}
