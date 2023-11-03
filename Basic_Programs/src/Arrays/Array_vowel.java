package Arrays;

import java.util.Scanner;

public class Array_vowel {

	public static void main(String[] args) {
		// Array vowel = a e  i  o  u using switch case 
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		switch(ch)
		{
			case 'a'|'A':
			case'e' |'E':
			case'i'|'I':
			case'o'|'O':
			case'u'|'U':
			System.out.print("Vowel");
			break;
			default:
			System.out.println("Consonant");
			
		}

	}

}
