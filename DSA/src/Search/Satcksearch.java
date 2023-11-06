package Search;

import java.util.*;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Satcksearch {

	public static void main(String[] args) {
		Stack<String>stk=new Stack<>();
		//pushing elemts into stack 
		System.out.println(stk.isEmpty()); // boolean values 
		stk.push("mac book");
		stk.push("Hp");
		stk.push("DELL");
		stk.push("ASUS");
		System.out.println("Stack:"+stk);
		//Search an elemnt
		int location = stk.search("Hp");
		System.out.println(stk.search("Test")); // if element is not there then prints -1
		System.out.println("Location of HP: "+location);
		System.out.println("Size of the stack : "+stk.size());
		//Using iterator 
		Iterator iterator =stk.iterator();
		while(iterator.hasNext()) {
			Object values = iterator.next();
			System.out.println(values);
		}
		//using forEach
		System.out.println("\nFor Each: ");
		stk.forEach(n -> System.out.println(n));  // java 8
		
		//stack in reverse 
		ListIterator<String> ListIterator = stk.listIterator(stk.size());
		System.out.println("\nIteration over the stack from top to "+"bottom : ");
		while(ListIterator.hasPrevious()) {
			String avg = ListIterator.previous();
			System.out.println(avg);
		}

	}

}
