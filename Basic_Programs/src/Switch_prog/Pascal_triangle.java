package Switch_prog;

import java.util.Scanner;

public class Pascal_triangle {

	public static void main(String[] args) {
		// Pascal triangle 
		int n;
		Scanner s =new Scanner(System.in);
		System.out.print("enter the number :");
		n=s.nextInt();
		 
		for(int i=1;i<=n;i++) {
			for(int sp=n;sp>=i;sp--) {
				System.out.print(" ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		s.close();

	}

}
