package Pattern_task;

import java.util.Scanner;

public class Numb_tri_pyramid {

	public static void main(String[] args) {
		// continues number in pyrmid 
		int n,sum=1;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		for(int i=1;i<=n;i++){
			for(int space=n;space>i;space--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(sum+" ");
				sum++;
			
			}
			System.out.println();
			
		}
		s.close();
		
		}

	}



