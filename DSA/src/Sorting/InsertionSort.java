package Sorting;

import java.util.Scanner;

public class InsertionSort {
	static void InsertionSort(int n,int ar[]) {
		int t,key;
		for (int step=1;step<n;step++) {
			key=step;
			for(int i=step;i>=0;i--) {
				if(ar[i]>ar[key]) {
					t=ar[i];
					ar[i]=ar[key];
					ar[key]=t;
					key--;
				}
			}
		}
	}
	static void printArray(int n,int ar[]) {
		System.out.println("After affter sorting : ");
		for(int i=0;i<n;i++) {
			System.out.println(ar[i]+" ");
		}
	}

	public static void main(String[] args) {
		//Insertion sort 
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=s.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the array elements: ");
		for(int i=0;i<n;i++) {
			ar[i]=s.nextInt();
			
		}
		InsertionSort(n,ar);
		printArray(n,ar);

	}

}
