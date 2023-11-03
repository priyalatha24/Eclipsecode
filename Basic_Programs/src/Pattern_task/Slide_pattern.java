package Pattern_task;

import java.util.Scanner;

public class Slide_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		
		for(int i=1;i<n;i++) {
			for(int x=n;x>=i;x--) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		
		}

	}

}
