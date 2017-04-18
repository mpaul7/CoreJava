import java.util.ArrayList;


public class ArrayListBasics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// creating an ArrayList
		ArrayList<Integer> grades = new ArrayList();
		grades.add(90);
		grades.add(85);
		grades.add(70);
		
		//Printing the list
		for(int i = 0; i < grades.size(); i++){
			System.out.println("Grade " + i + " = " + grades.get(i));
			// in Array, this can be done like grades[i],
			//  but in ArrayLists grades.get[i];
			}
		System.out.println(grades);
		//Removing an element from a list
		grades.remove(1); // to remove a value from an arry at any index value
		// but this is not possible in an Array
		// other way of iterating through a collection is 
					
		for(int al : grades){
			System.out.println(al);
		}
		
		System.out.println(grades);
		
		System.out.println(grades.isEmpty());

	}

}
