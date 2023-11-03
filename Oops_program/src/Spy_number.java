import java.util.Scanner;

public class Spy_number {

	public static void main(String[] args) {
		// Spy number 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		
		if(spynumber(n)) {
			System.out.println("this is a spy number ");
		}
		else {
			System.out.println("not a spy number");
		}
		while(n>10) {
			int s1 = n%10;
		    int sum = s1;
		    int multiply = s1;
		    n/=10;
		}
		

	}

	private static boolean spynumber(int n) {
		// TODO Auto-generated method stub
		return false;
	}

}
