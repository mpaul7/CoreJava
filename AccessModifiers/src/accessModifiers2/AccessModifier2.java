package accessModifiers2;


public class AccessModifier2 extends accessModifiers1.AccessModifiersBasics {
	public static void main(String args[]){
		AccessModifier2 O1 = new AccessModifier2();
		O1.i = O1.i + 50;
		System.out.println("O1.i = "  + O1.i);
	}
}
