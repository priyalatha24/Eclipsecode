package Arrays;

import java.util.Scanner;

public class File1 {

	
		void printarray(int n, int arr[]) {
			System.out.println("Array elemts : "); // this method should be abpve main method 
			for(int i=0;i<n;i++)
				System.out.println(arr[i]);
		}
		//----------------------------------------------
		public static void main(String[] args) {      // main method 
		File1 obj = new File1();
		Scanner s= new Scanner(System.in);// get array elements from user 
		int n;
		System.out.print("Eneter the  nuber of elements : ");
		n = s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elemets one by one: ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		obj.printarray(n,arr); // Method calling
		

	}

}
