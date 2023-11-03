import java.util.Scanner;

public class ATMprog {

	public static void main(String[] args) {
		while(true) {
		int n1=2000,temp;
		System.out.println("Enter the option:");
		System.out.println("select 1 to withdraw");
		System.out.println("select 2 to deposit");
		System.out.println("select 3 to check balance ");
		System.out.println("selct 4 to exist"); 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the option value");
		int n11 = s.nextInt();
		
		switch(n11)
		{
		case 1:System.out.println("Withdraw the money");
		int w = s.nextInt();
		temp = n1-w;
		System.out.println("The current amount is "+temp);
		break;
		
		case 2:
			System.out.println("deposit the money");
			int w1 = s.nextInt();
			temp = n1+w1;
			System.out.println("The current amount is "+temp);
			break;
			
		case 3:System.out.println("check balanance");
		//int d = s.nextInt();
		//temp = n11-n11;
		System.out.println(n1);
		break;
		
		case 4:
		System.exit(0);
		break;
		
		default:
			System.out.println("finished  ");
		}
			
	}

}
}
