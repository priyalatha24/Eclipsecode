package Collection;

import java.util.*;

public class TreeMap_Demo2 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// string and integer values changes the position 
		TreeMap<String,Integer> t = new TreeMap<String,Integer>();
		t.put("roy", new Integer (90));
		t.put("roy", new Integer (80));
		t.put("roy", new Integer (95));
		t.put("roy", new Integer (38));
		
		Set s = t.entrySet();
		
		@SuppressWarnings({"rawtypes"})
		Iterator i = s.iterator();
		System.out.println("the following are the marks : ");
		System.out.println("names\t\tmarks ");
		
		while(i.hasNext())
		{
			Map.Entry e = (Map.Entry)i.next();
			System.out.println(e.getKey()+"\t\t"+e.getValue());
		}
		if(t.containsKey("roy"))
			System.out.println("Map contains the entry 'roy' ");
		else
			System.out.println("Map does not contains the entry 'roy' ");
		t.put("macbeth", new Integer(58));
		i=s.iterator();
		System.out.println("Tree map after modifief is : ");
		System.out.println("name\t\tmarks");	
		

	}

}
