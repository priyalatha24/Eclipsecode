package Switch_prog;

import java.util.Scanner;

public class Rytangle_number {

	public static void main(String[] args) {
		//Ryt angle number 
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		
		for(int i=1;i<=n;i++) // ryt angle triangle number 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
				
		}
		s.close();

	}

}
