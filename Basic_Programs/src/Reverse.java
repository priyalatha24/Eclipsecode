import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// reversing the number in ouput 
		int n,r; // r= remainder 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		while(n>0) {
			r= n%10;
			System.out.println(r);
			n = n/10;
		}

	}

}
