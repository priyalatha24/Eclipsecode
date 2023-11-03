package Switch_prog;

import java.util.Scanner;

public class InverteredPyramid_Pattern {

	public static void main(String[] args) {
		// inverted pyramid 
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
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
