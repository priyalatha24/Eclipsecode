package Wrapperclass;

import java.util.Arrays;

public class Split_withoutParameter {

	public static void main(String[] args) {
		//split without parameter
		String vowels = "a:bc:de:fg:h";
		
		//splitting array contains all substrings 
		String[] result = vowels.split(":",-2);
		System.out.println("result when limit is -2 = "+Arrays.toString(result));
		
		//limit is 0; array contains all substrings
		result=vowels.split(":",0);
		System.out.println("result when limit is 0 =" +Arrays.toString(result));
		
		//limit is 2;array contains a max of 2 substrings 
		result = vowels.split(":",2);
		System.out.println("result when limit is 2 =" +Arrays.toString(result));
		
		//limit is 4;array contains a max of 4 substrings 
		result = vowels.split(":",4);
		System.out.println("result when limit is 4 =" +Arrays.toString(result));
		
		//limit is 10;array contains a max of 10 substrings 
	    result = vowels.split(":",10);
		System.out.println("result when limit is 10 =" +Arrays.toString(result));
		

	}

}
 