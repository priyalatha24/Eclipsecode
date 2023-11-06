package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExSum {

	public static void main(String[] args) {
		Queue<Integer>numbers=new PriorityQueue<>();
		numbers.offer(11);
		numbers.offer(5);
		numbers.offer(25);
		numbers.offer(34);
		numbers.offer(96);
		numbers.offer(112);
		System.out.println("Queue:"+numbers);
		int accessedNumber=numbers.peek();
		System.out.println("Access Element:"+accessedNumber);
		//Remove elemnts from the queue 
		int removedNumber = numbers.poll();
		System.out.println("Removed Elements:"+removedNumber);
		
		//Remove elemnts from the queue 
		int removedNumber1 = numbers.poll();
		System.out.println("Removed Elements :"+removedNumber1);
				
		System.out.println("Updated queue:"+numbers);


	}

}
