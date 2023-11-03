package Arrays;

import java.util.Scanner;

public class SecondLargest_secondSmallestArray {

	public static void main(String[] args) {
		//Second largest and second smallest elemt in array 
		Scanner s =new Scanner(System.in);
		int n, temp;
		System.out.print("ENther the array size : ");
		n=s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elemets one by one :");
		for(int i=0;i<n;i++)
			arr[i] = s.nextInt();
		
		// second largest elament in array 
		for(int i=0;i<n-1;i++) {  // n-1 => i<n means no values to compare after n so its is n-1
			for(int j=i+1;j<n;j++) {   // i+1 indicates next value of i
				if (arr[i]>arr[j]) {       //these are compareing blocks 
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
			System.out.print("\nSecond smallest: "+arr[1]);
			System.out.println("Second Largest: "+arr[n-2]);
		s.close();

	}

}
