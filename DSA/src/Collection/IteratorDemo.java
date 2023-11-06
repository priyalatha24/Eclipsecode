package Collection;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		// Create an array list 
		ArrayList a2 = new ArrayList();
		//add elements to array list
		a2.add("C");
		a2.add("A");
		a2.add("E");
		a2.add("B");
		a2.add("D");
		a2.add("F");
		//Use iterator to display contents of a2
		System.out.print("Original contents of a2: ");
		Iterator itr = a2.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element +" ");
		}
		System.out.println();
		
		//Modify objects being iterated 
		ListIterator itr1 = a2.listIterator();
		while(itr1.hasNext()) {
			Object element = itr1.next();
			itr1.set(element+"+");
			
		}
		System.out.println("Modified contents of a2: ");
		itr = a2.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element+" ");
		}
		System.out.println();
		
		//Now, display the list backwardes 
		System.out.print("Modified list backwards: ");
		while(itr1.hasPrevious()) {
			Object element = itr1.previous();
			System.out.println(element+" ");
		}
		System.out.println();

	}

}
