import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) {
		// positive and negative in if 
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the num1:");
	    n=s.nextInt();
	    if(n>0)
	    	System.out.println("positive number");
	    else if (n<0)
	        System.out.println("the no. is negative");
	    else if (n==0)
	    	System.out.println("Zero");
	    else 
	    	System.out.println("negative number");
		
	}

}
