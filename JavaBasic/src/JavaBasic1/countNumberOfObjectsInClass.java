package JavaBasic1;

class r{
	static int i = 0;
	r(){
		i++;
		}
	void m1(){
		System.out.println(i);
	}
}

public class countNumberOfObjectsInClass {
	public static void main (String args[]){
		System.out.println(r.i);
		r O1 = new r();
		r O2 = new r();
		r O3 = new r();
		r O4 = new r();
		r O5 = new r();
		
		O1.m1();
		
	}

}
