package javaFundamentals;

import java.util.Scanner;

public class Smallest_value {

	public static void main(String[] args) {
		int [] arr = {9,8,3,5,1,7,12};
		int smallest = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest= arr[i];
			}
		}
		//int smallest = arr[0];
		
		System.out.println("smallest array "+smallest);

	}

}
