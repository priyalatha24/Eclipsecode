import java.util.Scanner;

public class Odd_even {

	public static void main(String[] args) {
		// Odd even 
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the odd or even : ");
		n = s.nextInt();
		if(n%2==0)
			System.out.println("Even number");
		else
			System.out.println("odd number");
		s.close();
	

	}

}
