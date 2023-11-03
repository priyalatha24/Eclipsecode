package Regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_Casesensitive {

	public static void main(String[] args) {
		// pattern case sensitive 
		Pattern pattern=Pattern.compile("java Training",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher("Welcome Java Training");
		boolean matchFound=matcher.find();
		if(matchFound) {
			System.out.println("Match found");
			
		}else {
			System.out.println("Match not found ");
		}

	}

}
