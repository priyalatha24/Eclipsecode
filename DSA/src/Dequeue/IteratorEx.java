package Dequeue;

import java.util.ArrayDeque;
import java.util.Iterator;
public class IteratorEx{

	public static void main(String[] args) {
		ArrayDeque<String>animals = new ArrayDeque<>();
		animals.add("Dog");
		animals.add("cat");
		animals.add("cow");
		animals.add("hell");
		animals.add("Hen");
		animals.add("Lion");
		
		//Using itertor()
		System.out.println("\nArrayDeque: ");
		Iterator <String>iterate = animals.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		System.out.println("\nArrayDeque in reverse order:");
		
		//Using descendingIterator()
		Iterator<String> desIterate = animals.descendingIterator();
		while(desIterate.hasNext()) {
			System.out.print(desIterate.next());
			System.out.print(", ");
		}
		
	}

	

}
