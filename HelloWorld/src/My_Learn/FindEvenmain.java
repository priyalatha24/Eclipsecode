package My_Learn;

import java.util.Scanner;

public class FindEvenmain {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		FindEven obj =new FindEven();
		System.out.println("The Even numbers :"+obj.even(a));
		

	}

	}


