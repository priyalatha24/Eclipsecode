package Wrapperclass;

public class Char_to_string {

	public static void main(String[] args) {
		// char to string 
		char ch ='c';
		String st= Character.toString(ch);
		// Alternatively 
		String st1 = String.valueOf(ch);
		
		System.out.println("The string is : "+st);
		System.out.println("The string is: "+st1);
	}

}
