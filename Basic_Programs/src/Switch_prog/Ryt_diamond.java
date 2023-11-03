package Switch_prog;

import java.util.Scanner;

public class Ryt_diamond {

	public static void main(String[] args) {
		// Ryt Diamond 
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		
		for(int i=1;i<=n;i++) // ryt angle triangle 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
				
		}
		s.close();
		
		for(int i=2;i<=n;i++) { //inverted rty angle tri
			
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		s.close();

	}

}
