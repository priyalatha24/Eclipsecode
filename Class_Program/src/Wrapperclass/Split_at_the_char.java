package Wrapperclass;

import java.util.Arrays;

public class Split_at_the_char {

	public static void main(String[] args) {
		// split at the + char
		String vowels = "a+e+f";
		
		//splitting the string at "+"
		String[]result = vowels.split("\\+");
		
		//converting array to string and printing it 
		System.out.println("result= "+Arrays.toString(result));
	}

}
