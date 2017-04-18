
import java.util.*;
class Bank {

    String n;
    String add;
    int an;
    int bal;
    int dep;

    public Bank(String n, String add, int an, int bal) {

        this.add = add;
        this.bal = bal;
        this.an = an;
        this.n = n;

    }


/*
 * Returns a string representation of the object. In general, the toString method returns a string 
 * that "textually represents" this object. The result should be a concise but informative representation 
 * that is easy for a person to read. It is recommended that all subclasses override this method.
 * The toString method for class Object returns a string consisting of the name of the class of which the
 * object is an instance, the at-sign character `@', and the unsigned hexadecimal representation of the hash code
 * of the object. In other words, this method returns a string equal to the value of:
 * getClass().getName() + '@' + Integer.toHexString(hashCode())
*/
    
   /* public String toString() {
        return "Name of the customer.:" + this.n + ",, "
                + "Address of the customer.:" + this.add + ",, " + "A/c no..:"
                + this.an + ",, " + "Balance in A/c..:" + this.bal;
    }*/
}

public class toString2 {
	
	

    public static void main(String[] args) {

        List<Bank> l = new LinkedList<Bank>();

        Bank b1 = new Bank("naseem1", "Darbhanga,bihar", 123, 1000);
        Bank b2 = new Bank("naseem2", "patna,bihar", 124, 1500);
        Bank b3 = new Bank("naseem3", "madhubani,bihar", 125, 1600);
        Bank b4 = new Bank("naseem4", "samastipur,bihar", 126, 1700);
        Bank b5 = new Bank("naseem5", "muzafferpur,bihar", 127, 1800);
        l.add(b1);
        l.add(b2);
        l.add(b3);
        l.add(b4);
        l.add(b5);
        Iterator<Bank> i = l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}