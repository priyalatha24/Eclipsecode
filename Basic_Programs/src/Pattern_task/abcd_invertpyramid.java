package Pattern_task;

import java.util.Scanner;

public class abcd_invertpyramid {

	public static void main(String[] args) {
		/* a b c d e 
		    a b c d
		     a b c 
		      a b
		       a */
		int n,ascii;
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		for (int i =1;i<=n;i++) {
			ascii = 97;
		ch = 'a';
		for(int space=1;space<i;space++)
		{
			System.out.print(" ");
		}
		for(int j=n;j>=i;j--)
		{
			System.out.printf("%c ", ascii);
			ascii++;
		}
		System.out.println();
		}
		
	}

}
