package Regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_search {

	public static void main(String[] args) {
		// patten for searching via words 
		Pattern p=Pattern.compile("a(bb)");
		Matcher m=p.matcher("aabbabbabbaaa");
		while(m.find())
			System.out.println("Start :"+m.start()+", end: "+m.end()+", Group "+m.group() );

	}

}
