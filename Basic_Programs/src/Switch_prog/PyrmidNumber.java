package Switch_prog;

import java.util.Scanner;

public class PyrmidNumber {

	public static void main(String[] args) {
		// Pyramid in  number 

		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		for(int i=1;i<=n;i++) { // pyramid 
			for(int space=1;space<=n-i;space++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
				
		}
	     
	}

}
