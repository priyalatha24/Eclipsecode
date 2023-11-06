import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		// Deletion method 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elemnts : ");
		int n = s.nextInt();
		int arr[]=new int [n+1];   // array // always give n+1 as for extra space
		System.out.println("Enter the array elemnts one by one: ");
		
		for(int i=0;i<n;i++)        //elements 
			arr[i]=s.nextInt();
		
		// creating space for enter the position 
		System.out.println("enter the position you want to delete: ");
		int pos = s.nextInt();
		
		int j = pos;
		while(j<n) {  // j=5 jst assigning j values bcoz in print n is already used 
			arr[j-1]=arr[j]; // left side alwys j not j-1
			j++;
		}
		System.out.println("Array Trverse: ");
		for(int i=0;i<n-1;i++)               // print n 
			System.out.print(arr[i]+" ");
		s.close();
	}

	}


