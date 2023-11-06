import java.util.Scanner;

public class updation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elemnts : ");
		int n = s.nextInt();
		int arr[]=new int [n+1];   // array // always give n+1 as for extra space
		System.out.println("Enter the array elemnts one by one: ");
		
		for(int i=0;i<n;i++)        //elements 
			arr[i]=s.nextInt();
		
		// creating space for enter the position 
		System.out.println("enter the position you want to update: ");
		int pos = s.nextInt();
		System.out.println("Enter the element you want to update:");
		int element = s.nextInt();
		arr[pos-1]=element;
		System.out.println("Array Trverse: ");
		for(int i=0;i<n;i++)               // print n 
			System.out.print(arr[i]+" ");
		s.close();
	}


	}


