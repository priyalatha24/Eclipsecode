package Regular_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaAlphanumericRegex {

	public static void main(String[] args) {
		List< String >names=new ArrayList< String >();
		names.add("Imarticus");
		names.add("Imarticus123");
		names.add("Imarticus----////"); //incoreect
		
		String regex = "^[a-zA-Z0-9]+$";// ^ - starting should be alphabet $- for end 
		
		Pattern pattern = Pattern.compile(regex);
		
		for(String name:names) {
			Matcher matcher = pattern.matcher(name);
			System.out.println(matcher.matches());
		}
	}

}
