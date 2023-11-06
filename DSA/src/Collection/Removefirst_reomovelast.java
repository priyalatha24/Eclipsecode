package Collection;


import java.util.*;

public class Removefirst_reomovelast {

	public static void main(String[] args) {
       LinkedList<String> list = new LinkedList<String>();
		
		//Adding elements to the linked list 
		list.add("Steve");
		list.add("Carl");
		list.add("Raj");
		list.add("carl");
		
		//remove firt element
		// smake as list.remove(0);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		//list.remove(1);
		Iterator<String> iter=list.iterator(); // iterator is for printing 
		while(iter.hasNext()) {
			System.out.println(iter.next());
	}

	}}
