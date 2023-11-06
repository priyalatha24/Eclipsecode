package Problem;

import java.util.Scanner;

public class Sum_Average {

	public static void main(String[] args) {
		//sum and avaerage of all array
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int sum=0;
		double avg=0;
		for(int i=0;i<n;i++) {
			sum+=a[i];
		}
		System.out.println("sum ="+sum);
		avg=(double)sum/n;
		System.out.println("\n avarage="+avg);
	
	}

}
