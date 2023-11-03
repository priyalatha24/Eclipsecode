package Pattern_task;

import java.util.Scanner;

public class Sandglass_pattern {

	public static void main(String[] args) {
		// Sand glass pattern 
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		
		for (int i=1;i<n;i++) {
			for(int j=1;j<i;j++) {       // invertered pyramid 
				System.out.print(" "); // space 
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		for (int i=1;i<n;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" "); // for space     // pyramid 
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		s.close();
		
	}

}
