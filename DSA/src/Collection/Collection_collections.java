package Collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Collection_collections {

	public static void main(String[] args) {
		//list
		List<String> list = new ArrayList<String>(); // only string is indicated 
		list.add("HCL"); // list - interface 
		list.add("DELL");
		list.add("CTS");
		list.add("TCS");
		list.add("Tech Mahindra");
		list.add(2,"Zoho");
		list.set(1, "Imarticus");
		list.clear();
		//sortiong list in ascending oder according to the natural odering 
		
		//Collections.sort(list); // class 
		list.forEach(System.out::println); // short 1line method 
		
		/*other method to wrt 
		 * for(String str:list)
		 * System.out.println(str);  
		 */
		list.remove(2);
		System.out.println(list.indexOf("Imarticus"));
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println(list.contains("Hello"));
		for(String str:list)
			System.out.println(str);
	}

}
