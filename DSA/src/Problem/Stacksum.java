package Problem;

import java.util.*;


//import javax.swing.text.html.HTMLDocument.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class Stacksum {

	public static void main(String[] args) {
		Stack<Integer>stk=new Stack<>();
		stk.push(24);
		stk.push(5);
		stk.push(11);
		stk.push(36);
		stk.push(65);
		stk.pop();
		Iterator<Integer>iterator=stk.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
			System.out.print(" ");
		}
		System.out.println(" ");
		ListIterator<Integer>ListIterator=stk.listIterator(stk.size());
		while(ListIterator.hasPrevious()) {
			int avg=ListIterator.previous();
			System.out.print(avg+" ");
		}

	}}
