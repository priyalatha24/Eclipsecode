package Problem;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedlist {

	public static void main(String[] args) {
		//Creating queue using the linked list class
				Queue<Integer>numbers = new LinkedList<>();
				
				//offer elements to the queue 
				numbers.offer(11);
				numbers.offer(5);
				numbers.offer(25);
				numbers.offer(34);
				numbers.offer(96);
				numbers.offer(112);
				System.out.println("Queue:"+numbers);
				
				//Access elemts of the queue 
				int accessedNumber= numbers.peek();
				System.out.println("Accessed Element:"+accessedNumber);
				
				//Remove elemnts from the queue 
				int removedNumber = numbers.poll();
				System.out.println("Removed Elements:"+removedNumber);
				
				System.out.println("Reversed Element: "+numbers.remove(34));
				System.out.println("Updated queue:"+numbers);
			}
		}
