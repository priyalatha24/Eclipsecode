import java.util.Scanner;

public class Traverse {
	// Traverse , insertion 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elemnts : ");
		int n = s.nextInt();
		int arr[]=new int [n+1];   // array // always give n+1 as for extra space
		System.out.println("Enter the array elemnts one by one: ");
		
		for(int i=0;i<n;i++)        //elements 
			arr[i]=s.nextInt();
		
		// creating space for enter the position 
		System.out.println("enter the position you want to insert: ");
		int pos = s.nextInt();
		// creating space for inserting the number in 3rd position 
		System.out.println("Enter the elemts you wnat to insert: ");
		int element = s.nextInt();
		
		int j = n;
		while(j>pos) {  // j=5 jst assigning j values bcoz in print n is already used 
			arr[j]=arr[j-1]; // left side alwys j not j-1
			j--;
		}
		arr[pos]=element; // replacing values of givern 
		System.out.println("Array Trverse: ");
		for(int i=0;i<=n;i++)               // print n 
			System.out.print(arr[i]+" ");
		s.close();
	}

}
