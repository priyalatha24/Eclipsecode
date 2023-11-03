package Arrays;

import java.util.Scanner;

public class Remove_duplicate {

	public static void main(String[] args) {
		// Remove duplicate 
		Scanner s=new Scanner(System.in);
		int n,count=0,flag=0; 
		System.out.print("Enter array size: ");                       // before reomve duplicate elemts 
		n =s.nextInt();
		int arr[]=new int[n];
		int temp[]=new int[n]; // after remove duplicate value store temp vaulue 
		System.out.println("Read the array elemts : ");
		for(int i=0;i<n;i++) {
			System.out.print("Enter the array elemts of index "+i+": ");
		    arr[i]=s.nextInt();
		}
		System.out.println("Before removing the duplicate elamets are : ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		//-------------------------------------------------------------------------
		System.out.println("After  removing dupliate elemts array are : ");
		for(int i=0; i<n;i++) {
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
	    	System.out.println(temp[i]);

	}
	
}
