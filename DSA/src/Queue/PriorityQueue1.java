package Queue;

import java.util.*;


public class PriorityQueue1 {

	public static void main(String[] args) {
		Queue<Integer>numbers=new PriorityQueue<>();
		numbers.offer(5);
		numbers.offer(1);
		numbers.offer(2);
		System.out.println("Queue:"+numbers);
		int accessedNumber=numbers.peek();
		System.out.println("Access Element:"+accessedNumber);
		//Remove elemnts from the queue 
		int removedNumber = numbers.poll();
		System.out.println("Removed Elements:"+removedNumber);
		
		System.out.println("Updated queue:"+numbers);


	}

}
