
public class String_charFind_indexvalue {

	public static void main(String[] args) {
		/*
		//String x ="Ac @";
				
				int firstCapitalLetter = -1;
				int firstSmallLetter =-1;
				int firstVowel =-1;
				int firstConsonant=-1;
				int firstWhitespace =-1;
				int firstSpecialCharacter =-1;
				
				String x = null;
				for(int i=0;i<x.length();i++) {
				char c = x.charAt(i);
				
				if(Character.isUpperCase(c)&& firstCapitalLetter == -1) {
					firstCapitalLetter =i;
				}else if(Character.isLowerCase(c)&& firstSmallLetter == -1){
					firstSmallLetter = i;
				}else if("AEIOUaeiou".indexOf(c)>=0 && firstVowel ==-1) {
					firstVowel =i;
				}else if (Character.isLetter(c)&& firstConsonant == -1) {
					firstConsonant = i;
				}else if(Character.isWhitespace(c)&& firstWhitespace == -1) {
					firstWhitespace = i;
				}else if(!Character.isLetterOrDigit(c)&& firstSpecialCharacter == -1 ) {
					firstSpecialCharacter = i;
				}
				}
				System.out.println("First capital letter : "+firstCapitalLetter);
				System.out.println("First small letter : "+firstSmallLetter);
				System.out.println("First vowel : "+firstVowel);
				System.out.println("First consonant : "+firstConsonant);
				System.out.println("First whitespace : "+firstWhitespace);
				System.out.println("First speacil letter : "+firstSpecialCharacter);
				

}}*/
		 String x = "Ac @";
	        
	        // Initialize variables to store positions
	        int firstCapitalLetter = -1;
	        int firstSmallLetter = -1;
	        int firstVowel = -1;
	        int firstConsonant = -1;
	        int firstWhitespace = -1;
	        int firstSpecialCharacter = -1;
	        
	        for (int i = 0; i < x.length(); i++) {
	            char c = x.charAt(i);
	            
	            if (Character.isUpperCase(c) && firstCapitalLetter == -1) {
	                firstCapitalLetter = i;
	            } else if (Character.isLowerCase(c) && firstSmallLetter == -1) {
	                firstSmallLetter = i;
	            } else if ("AEIOUaeiou".indexOf(c) >= 0 && firstVowel == -1) {
	                firstVowel = i;
	            } else if (Character.isLetter(c) && firstConsonant == -1) {
	                firstConsonant = i;
	            } else if (Character.isWhitespace(c) && firstWhitespace == -1) {
	                firstWhitespace = i;
	            } else if (!Character.isLetterOrDigit(c) && firstSpecialCharacter == -1) {
	                firstSpecialCharacter = i;
	            }
	        }
	        
	        System.out.println("First capital letter position: " + firstCapitalLetter);
	        System.out.println("First small letter position: " + firstSmallLetter);
	        System.out.println("First vowel position: " + firstVowel);
	        System.out.println("First consonant position: " + firstConsonant);
	        System.out.println("First whitespace position: " + firstWhitespace);
	        System.out.println("First special character position: " + firstSpecialCharacter);
	    }
	}

		
