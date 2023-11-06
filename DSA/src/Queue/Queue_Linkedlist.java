package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Linkedlist {

	public static void main(String[] args) {
		//Creating queue using the linked list class
		Queue<Integer>numbers = new LinkedList<>();
		
		//offer elements to the queue 
		numbers.offer(1);
		numbers.offer(2);
		numbers.offer(3);
		System.out.println("Queue:"+numbers);
		
		//Access elemts of the queue 
		int accessedNumber= numbers.peek();
		System.out.println("Accessed Element:"+accessedNumber);
		
		//Remove elemnts from the queue 
		int removedNumber = numbers.poll();
		System.out.println("Removed Elements:"+removedNumber);
		
		System.out.println("Updated queue:"+numbers);
	}
}
