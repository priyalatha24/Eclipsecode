package javaFundamentals;

import java.util.Scanner;

public class Max_value {

	public static void main(String[] args) {
		int arr[]= {9,8,3,5,1,7,12};
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		FindVaueofIndex obj= new FindVaueofIndex();
		//obj.minMax(arr);
		System.out.println("The index of "+n+" :");
		obj.findValue(arr,n);
		
}
}
