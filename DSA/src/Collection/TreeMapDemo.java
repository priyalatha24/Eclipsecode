package Collection;

import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		// this is how to declare TreeMap 
		TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
		 
		//Adding elements to treemap
		tmap.put(1,"Data1");
		tmap.put(23,"Data2");
		tmap.put(70,"Data3");
		tmap.put(40,"Data4");
		tmap.put(2,"Data5");
		
		//Display content using iterator 
		Set set = tmap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.print("Key is :"+mentry.getKey()+" & Value is : ");
			System.out.println(mentry.getValue());
		}

	}

}
