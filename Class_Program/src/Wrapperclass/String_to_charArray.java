package Wrapperclass;

import java.util.Arrays;

public class String_to_charArray {

	public static void main(String[] args) {
		// String to char array 
		String st = "This is great";
		
		char[]chars = st.toCharArray();
		for(int i=0;i<chars.length;i++) 
			{
			if(i==chars.length-1)                 // to  avoid comma at the last  in o/p
				System.out.println(chars[i]);
			else
			System.out.print(chars[i]+",");
		}
		System.out.println();
		System.out.println(Arrays.toString(chars));

	}

}
