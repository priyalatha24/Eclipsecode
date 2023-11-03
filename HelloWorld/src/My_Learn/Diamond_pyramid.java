package My_Learn;

import java.util.Scanner;

public class Diamond_pyramid {

	public static void main(String[] args) {
		// diamond pyramid pattern 
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");  // up side pyramud 
				
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//------------------------------------
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<i;j++) 
			{
				System.out.print(" ");    // down side pyramid 
				
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
