package Arrays;

import java.util.Scanner;

public class Array_sum {

	public static void main(String[] args) {
		// Array = sum 
		Scanner s=new Scanner(System.in);
		int n,sum=1, avg=1;
		n=s.nextInt();
		int arr[]=new int[n];
		for (int i=0; i < n; i++) 
			arr[i]=s.nextInt();
		
		for(int i=1;i<n;i++) {
			sum=sum+arr[i];
			avg= sum/n;
			
		}
		System.out.println("sum ="+sum);
		System.out.println("avrage= "+avg);
	
		

	}

}
