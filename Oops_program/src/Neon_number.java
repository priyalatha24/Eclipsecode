import java.util.Scanner;

public class Neon_number {

	public static void main(String[] args) {
		// neon number 
		int n,result;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.println("Enter the n  value : ");
		
		result = (int)Math.pow((n/100)+ (n%100)*(2), n);
		if(n==result)
			System.out.println(n+"is a neon number");
	    else 
		    System.out.println(n+"Not a neon  number");

	}

}
