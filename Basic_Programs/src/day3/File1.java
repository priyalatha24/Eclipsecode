package day3;

import java.util.Scanner;

public class File1 {
	
	void add() {
		int num1=10,num2=20;
		System.out.println("Addition: "+(num1+num2));
	}

	public static void main(String[] args) {
		// adding 2 number 
		Scanner scan = new Scanner (System.in);
		File1 obj = new File1();//object creation 
		obj.add();//method call 
        
	}

}
