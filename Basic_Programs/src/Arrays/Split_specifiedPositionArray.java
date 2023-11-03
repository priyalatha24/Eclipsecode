package Arrays;

import java.util.Scanner;

public class Split_specifiedPositionArray {

	public static void main(String[] args) {
		// split an array from spacified position 
		Scanner s=new Scanner(System.in);
		int n,pos;
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the no.of elements you want array : ");
		for (int i=0; i < n; i++) {
			arr[i]=s.nextInt();
			
		}
		System.out.println("Enter all the elemts  ");
		pos =s.nextInt();
		System.out.println("First array:");
		for (int i=0; i < pos; i++) {
			System.out.println(" "+arr[i]);
		}
		
		

	}

}
