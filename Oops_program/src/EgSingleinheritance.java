class Bank{
	int account_no=1305;
	String name="Ravi";
	float amount = 3000;
	
}
public class EgSingleinheritance extends Bank{
	
	void deposit(int amount) {
		this.amount+=amount;
		
	}
	void withdraw(int amount) {
		this.amount-=amount;
		
	}

	public static void main(String[] args) {
		EgSingleinheritance s = new EgSingleinheritance();
		s.deposit(1000);
		System.out.println("Account Number: "+s.account_no);
		System.out.println("Name: "+s.name);
		System.out.println("Amount: "+s.amount);

	}

}
