package My_Learn;

import java.util.Scanner;

public class Diamondhill_pattern {

	public static void main(String[] args) {
		/* Diamond pattern 
		           *
		        *  *  *
		     *  *  *  *  *
		        *  *  *
		           *
		 */
		int n=5;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		
		for(int i=1;i<n;i++) 
		{
			for(int j=i;j<=n;j++) 
			{
				System.out.print("  ");  // hill up side 
			}
			for(int j=1;j<i;j++) 
			{
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//-----------------------------------------------
		for(int i=1;i<n;i++) 
		{
			for(int j=1;j<=i;j++)    // hill down side 
			{
				System.out.print("  "); // space
			}
			for(int j=i;j<n;j++) 
			{
				System.out.print("* "); // middle vertical star line j<n for one line 
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");// j<=n for hill st star not like pyramid star 
			}
			System.out.println();
		}
		
		s.close();
	}

}
