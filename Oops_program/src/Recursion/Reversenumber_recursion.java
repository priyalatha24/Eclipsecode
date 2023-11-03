package Recursion;

import java.util.Scanner;

public class Reversenumber_recursion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		callMyself(n); //5 = 5 4 3 2 1 
	}
/* the recursinve java method */
	private static void callMyself(long i) {
		if(i<=0) {
			return;
			
		}
		System.out.print(i+" ");
		i = i -1 ;
		callMyself(i);
		
	}

}
