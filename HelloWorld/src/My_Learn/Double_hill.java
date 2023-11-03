package My_Learn;

import java.util.Scanner;

public class Double_hill {

	public static void main(String[] args) {
		// Double hill 
		int n;
		Scanner s =new Scanner(System.in);
		System.out.println("enter the value = ");
		n=s.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");	  //up pyramid left 
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//---------------------------------------
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++) 
			{
				System.out.print(" ");	  //up pyramid left 
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
