package Recursion;

import java.util.Scanner;

public class PrimeNumber_recursive {
	static int number=2,count;
	static int isprime(int number1) {
		for(int j=2;j<=number1/2;j++) {
			if(number1%j==0) {
				number1++;
				isprime(number1);	
			}
		}
		if(count==0) {
			System.out.println(number1+" ");
			count++;
		}
		return number1;
	}
	public static void primenumber(int num) {//primenumbr(10)
		count=0;
		if(num==0)
			return;
		else {
			if(number==2) {
				System.out.println(number+" ");
				number++;
			}
			else {
				number=isprime(number);
				number++;
			}
		}
		primenumber(--num);
	}
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		primenumber(n);
		s.close();
	}

}
