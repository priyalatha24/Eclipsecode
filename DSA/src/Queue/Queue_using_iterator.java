package Queue;

import java.util.*;



public class Queue_using_iterator {

	public static void main(String[] args) {
		// Creating a priority queue 
		PriorityQueue<Integer>numbers=new PriorityQueue<>();
		numbers.add(4);
		numbers.add(2);
		numbers.add(1);
		System.out.println("Priority Queue using iterator():");
		Iterator<Integer> iterate=numbers.iterator();
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(",");
		}

	}

}
	


