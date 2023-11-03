package Bp_Floatprogram;

import java.util.Scanner;

public class File4 {

	public static void main(String[] args) {
		// Importing package of class 
        int num1, num2;// to get integer 
		Scanner s =  new Scanner(System.in);
		System.out.print("Enter the num1: ");
		num1= s.nextInt();
		System.out.print("Enter the num2: ");
		num2 = s.nextInt();
		System.out.println(num1+num2);
		s.close();

	}

}
