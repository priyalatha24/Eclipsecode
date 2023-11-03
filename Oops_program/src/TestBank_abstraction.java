abstract class Bank1{
	abstract int getRateOfInterest();
}
class SBI extends Bank1{
	int getRateOfInterest() {
		return 7;
	}
}
class PNB extends Bank1{
	int getRateOfInterest() {
		return 8;
	}
}
public class TestBank_abstraction {

	public static void main(String[] args) {
		Bank1 b;
		b=new SBI();
		System.out.println("Rate of Interest is : "+b.getRateOfInterest()+"%");
		b=new PNB();
		System.out.println("Rate of interest is : "+b.getRateOfInterest()+"%");
	}

}
