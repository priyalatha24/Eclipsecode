package Arrays;

import java.util.Scanner;

public class RemoveDuplicate_array {

	public static void main(String[] args) {
		// Removing duplicate elements from array
		Scanner s =new Scanner(System.in);
		int n,flag=0,count=0;
		System.out.println("Enter the array size: ");
	    n = s.nextInt();
	    int arr[] = new int[n];
	    System.out.println("Read the array elements");
	    int temp[]=new int[n];
	    
	    
	    for(int i=0;i<n;i++) {
	    	System.out.println("Enter the array elemts of index :");
	    	arr[i]=s.nextInt();
	    }
	    
	    System.out.println("Before removing the duplicate elamets are : ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	    //--------------------------------------------------------------------------
		System.out.println("After removing the duplicate element array are :");
		for (int i=0;i<n;i++) {
			flag=0;
			if(i==0)
				temp[count++]=arr[i];  //array to store non duplicate value
			else {
				for(int j=0;j<count;j++) // to read all elament of temp 
				{
					if(arr[i]==temp[j]) {
						flag=1;
					break;
					}
				}
				if(flag==0)
					temp[count++]=arr[i];
				
			}
		}
	    for(int i=0;i<count;i++)
	    	System.out.print(temp[i]+" ");
		}
			

	}


