package Looping;

import java.util.Scanner;

public class Prog1 {
/*
	public static void main(String[] args) {
		// if = gratest among 2 values 
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the num1:");
		a=s.nextInt();
		System.out.println("Enter the num2: ");
		b=s.nextInt();
		if(a>b)
		{
			c=a;
			System.out.println("a is greater :"+c);//block 
		}
		else
		{
			c=b;
			System.out.println("b is greater :"+c);
		}
		//System.out.println("c ="+c);
		s.close();




*/
	public static void main(String[] args) {
	// if = gratest among 2 values 
		int a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the num1:");
	    a=s.nextInt();
	    System.out.println("Enter the num2: ");
	    b=s.nextInt();
	    System.out.println("Enter the num3 :");
	    c=s.nextInt();
	    if(a>b && a>c)// in java - and &&
		System.out.println("a is greater :"+a);//block 
	    else if(b>a && b>c)
		System.out.println("b is greater :"+b);
	    else
		System.out.println("c is greater :"+c);
	//System.out.println("c ="+c);
	    s.close();
	}   
}