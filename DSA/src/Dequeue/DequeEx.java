package Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {
		// Creating deque using the arrayDeque class 
		Deque<Integer>numbers = new ArrayDeque<>();
		//add elemets to the deque 
		numbers.offer(1);
		numbers.offerLast(2);
		numbers.offerFirst(3);
		System.out.println("Deque: "+numbers);
		
		//Access elemnts of the deque 
		int firstElement = numbers.peekFirst();
		System.out.println("First element: "+firstElement);
		
		int lastElement = numbers.peekLast();
		System.out.println("Last Element: "+lastElement);
		
		//Remove elements from the deque 
		int removedNumber1 = numbers.pollFirst();
		System.out.println("Removed first eleement: "+removedNumber1);
		
		int removedNumber2 = numbers.pollLast();
		System.out.println("Removed last eleement: "+removedNumber2);
		
		System.out.println("Updated deque: "+numbers);
		
		
	}

}
