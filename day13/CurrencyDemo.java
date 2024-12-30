package day13;

interface Money {
	void dollartoInr(int usDollar);
	void poundtoInr(int ukPound);
}
class IndianRupee implements Money {

	@Override
	public void dollartoInr(int usDollar) {
		float res =84.75f *usDollar;
		System.out.println("dollar"+usDollar+"indian rupees"+res);
	}

	@Override
	public void poundtoInr(int ukPound) {
		float res=120.65f*ukPound;
		System.out.println("Pound"+ukPound+"indian rupees"+res);
	}
}

public class CurrencyDemo {

	public static void main(String[] args) {
		IndianRupee indianRupees=new IndianRupee ();
		indianRupees.dollartoInr(100);
		indianRupees.poundtoInr(100);

}
}