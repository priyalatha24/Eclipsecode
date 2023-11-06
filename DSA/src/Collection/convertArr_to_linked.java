package Collection;

import java.util.*;

public class convertArr_to_linked {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//convert arraylist into linked list 
		LinkedList<String> linkedlist = new LinkedList<String>();
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("String1");
		arraylist.add("String2");
		linkedlist.addAll(arraylist);
		System.out.println(linkedlist);
		
		list.add("Hcl");
		list.add("DELL");
		list.add("CTS");
		list.add("TCS");
		list.add("Carl");
		list.add(2,"Raj");
		list.add(1,"Imarticus");
		//collections.sort(list);
		list.forEach(System.out::println);
		
		list.remove(2);
		list.addFirst("IBM");
		list.addLast("Pwc India");
		
		list.add("Imarticus222");
		
		System.out.println(list.indexOf("Inmarticus"));
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println(list.contains("hello"));
		System.out.println(list.getFirst());    // get first and get last 
		System.out.println(list.getLast());
		System.out.println(list.lastIndexOf("Imarticus"));
		
		System.out.println(list); //listing elements 
		
		list.poll (); // last element removed - imarticus
		list.pollFirst();// remove 1st element - IBM
		list.pollLast();//remove the last elments - pwc india 
		list.remove("TCS");//remove the TCS elemenst 
		list.remove(1);// remove the 1st index elemets
		
		Iterator<String> iter=list.iterator(); // iterator is for printing 
		while(iter.hasNext()) {
			System.out.println(iter.next());
	}
		list.clear();
		System.out.println(list);


	}

}
