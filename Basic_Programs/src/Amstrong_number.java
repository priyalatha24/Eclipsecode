import java.util.Scanner;

public class Amstrong_number {

	public static void main(String[] args) {
		// Amstrong number 
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();// 153, 370,371,407 only 3 digits it works not for 4 digits number 1624
		System.out.print("Enter n = ");
		int sum=0,r,temp=n;
		
		String str1 =String.valueOf(n);// convert into string then we can print 4 digit or any value of number  
		int len = str1.length();
		
		while(n>0) {
			r=n%10;
			sum =(int)(sum+Math.pow(r, len));
			n=n/10;
			
		}
		if (temp==sum)
			System.out.println("Amstrong number ");
		else
			System.out.println("Not a amstrong number");
		s.close();

	}

}
