package Collection;

import java.util.*;

public class Linked_ex_collection {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		//Adding elements to the linked list 
		list.add("Steve");
		list.add("Carl");
		list.add("Raj");
		
		//Adding an element to the first position 
		list.addFirst("Negan");
		
		//Adding an element to the last position 
		list.addLast("Rick");
		
		//adding an elemenr to the 3rd positon 
		list.add(2,"Glenn");
		
		//iterating LinkedList , iterateor is class 
		Iterator<String> iter=list.iterator(); // iterator is for printing 
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		

	}

}
