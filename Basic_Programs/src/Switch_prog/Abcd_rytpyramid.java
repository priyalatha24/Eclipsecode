package Switch_prog;

import java.util.Scanner;

public class Abcd_rytpyramid {

	public static void main(String[] args) {
		/* A
		   A B 
		   A B C 
		   A B C D */
		//int n ascii; 
		int n;char ch;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		
		for(int i=1; i<=n;i++) {
		//ascii = 65;
			ch='A';
			for(int j=1;j<=i;j++) {
				//S.o.pf("%c",ascii")
			System.out.print(ch++);
				//ascii++;
				// ch++;
			{
				System.out.print(" ");
			}
			}
			System.out.println();
		}
		s.close();
		

	}

}
