package Arrays;

import java.util.Scanner;

public class Array_qnslargesmall {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n;
		n=s.nextInt();
		int arr[]=new int[n];
		for (int i=0; i < n; i++) 
			arr[i]=s.nextInt();
		int large=arr[0],small=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>large)
				large=arr[i];
		}
	System.out.println("Largest Number is : " + large);
	    for(int i=1;i<n;i++) {
	    	if(arr[i]<small)
	    		small=arr[i];
	    }
			  
	System.out.println("Smallest Number is : " + small);
	}

}
