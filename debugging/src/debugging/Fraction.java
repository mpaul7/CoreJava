package debugging;

public class Fraction {
	
	private int numerator;
	private int denominator;

	public Fraction(int numerator, int denominator) {
		// TODO Auto-generated constructor stub
		this.numerator  = numerator;
		this.denominator = denominator;
	}

	
	

	public Fraction add(Fraction that) {
		int num = (this.numerator * that.denominator)
				+ (this.denominator * that.numerator);
		int den = this.denominator * that.denominator;
		Fraction sum = new Fraction(num, den);
		//sum.simplify();
		return sum;
			}

	/*private void simplify() {
		// TODO Auto-generated method stub
		
	}*/

}
