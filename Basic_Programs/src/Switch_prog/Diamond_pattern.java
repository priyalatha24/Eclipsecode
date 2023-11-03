package Switch_prog;

import java.util.Scanner;

public class Diamond_pattern {

	public static void main(String[] args) {
		//Diamond pattern 
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		
		for(int i=1;i<=n;i++) { // pyramid 
			for(int space=1;space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
				
			}
			System.out.println();
				
		}
		for(int i=2;i<=n;i++) { //invertered pyramid 
			for(int space=1;space<i;space++) {
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		s.close();


	}

}
