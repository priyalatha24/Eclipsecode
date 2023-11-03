package Regular_expression;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_compile_Doteven {

	public static void main(String[] args) {
		// pattern using .even
		List<String>words = Arrays.asList("One","Two","three","Four","Five","Six",
				"Seven","Maven","Amen","Eleven");
		Pattern p=Pattern.compile(".even");//reven,seven,ceven
		for(String word: words) {
			Matcher m =p.matcher(word);
			if(m.matches())
				System.out.printf("%s -> matches%n",word); // formate -->use (,)
			else
				System.out.printf("%s ->does not match%n",word);
				
		}

	}

}
