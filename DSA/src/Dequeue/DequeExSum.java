package Dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.*;

public class DequeExSum {

	public static void main(String[] args) {
		// Creating deque using the arrayDeque class 
				Deque<String>numbers = new ArrayDeque<>();
				//add elemets to the deque 
				numbers.offer("one");
				numbers.offer("two");
				numbers.offer("three");
				numbers.offer("four");
				numbers.offer("five");
				numbers.offerFirst("red");
				numbers.offerLast("black");
				System.out.println("Deque: "+numbers);
				
				//Access elemnts of the deque 
				String firstElement = numbers.peekFirst();
				System.out.println("First element: "+firstElement);
				
				String lastElement = numbers.peekLast();
				System.out.println("Last Element: "+lastElement);
				
				//Remove elements from the deque 
				String removedNumber1 = numbers.pollFirst();
				System.out.println("Removed first eleement: "+removedNumber1);
				
				String removedNumber2 = numbers.pollLast();
				System.out.println("Removed last eleement: "+removedNumber2);
				
				numbers.remove("three");
				System.out.println("remove three : "+numbers);
				System.out.println("Updated deque: "+numbers);
				System.out.println("\nArrayDeque in reverse order:");
				//using descending iterator()
				Iterator<String> desIte = numbers.descendingIterator();
				while(desIte.hasNext()) {
					System.out.print(desIte.next());
					System.out.print(" ");
				}
				
				
			}

		}

