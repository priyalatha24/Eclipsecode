package Pattern_task;

import java.util.Scanner;

public class Boader_outerlftsqr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int sp=1;sp<=i;sp++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}
}


