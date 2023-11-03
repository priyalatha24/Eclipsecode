import java.util.Scanner;

public class Factorial_sum {

	public static void main(String[] args) {
		// Factorial of given number 
		int n, fact=1;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.print("factorial = "+fact);

	}

}
