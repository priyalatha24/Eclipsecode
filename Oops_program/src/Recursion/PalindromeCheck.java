package Recursion;

public class PalindromeCheck {

	public static void main(String[] args) {
		boolean flag = palindromCheck("madam");
		System.out.println(flag);
		flag = palindromCheck("nine");
		System.out.println(flag);
		flag = palindromCheck("malayalam");
		System.out.println(flag);
	}
	/*Recursive java example to check for palindrome*/

	private static boolean palindromCheck(String s) {
		if(s.length()==0 || s.length()==1) {
			return true;	
		}
		if(s.charAt(0)==s.charAt(s.length()-1)) {
			return palindromCheck(s.substring(1,s.length()-1));
			
		}
		return false;
		
	}

}
