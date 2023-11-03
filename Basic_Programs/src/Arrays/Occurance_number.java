package Arrays;

import java.util.Scanner;

public class Occurance_number {

	public static void main(String[] args) {
		// number of occurance of element
		int n,element,count=0;
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		for (int i=0; i < n; i++) 
			arr[i]=s.nextInt();
		System.out.print("Enter the element you want to check the "+"Occurance: ");
		element=s.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==element)
				count++;
		}
		System.out.println(count);
		s.close();
	}

}
