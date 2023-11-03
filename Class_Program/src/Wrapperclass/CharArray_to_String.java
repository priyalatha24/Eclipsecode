package Wrapperclass;

public class CharArray_to_String {

	public static void main(String[] args) {
		// Char array to string '
		char[] ch = {'a','e','i','o','u'};
		
		String st = String.valueOf(ch);
		String st2=new String(ch);
		
		System.out.println(st);
		System.out.println(st2);

	}

}
