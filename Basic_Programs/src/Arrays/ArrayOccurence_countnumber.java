package Arrays;

import java.util.Scanner;

public class ArrayOccurence_countnumber {

	public static void main(String[] args) {
		// count the number of occurence of elemnt in array 
		int n,element,count=0;
		Scanner s =new Scanner(System.in);
		System.out.print("Enter the element you want to array  :");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.print("enter all the elsmets : ");
		for (int i=0; i < n; i++) 
			arr[i]=s.nextInt();
		System.out.print("Enter the elements of which you want to count number of occurrence :");
		element=s.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==element) {
				count++;
			
		}
	
	}
		if(count<1)
			System.out.print("Element not present ");
		else
		System.out.println("number od occurence :"+count);
		s.close();

	}

}
