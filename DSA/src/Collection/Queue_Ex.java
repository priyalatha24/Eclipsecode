package Collection;

import java.util.*;

public class Queue_Ex {

	public static void main(String[] args) {
		/*we cannot create instanv=ce of queue as it ad interface 
		 * we can create instance of linkedlist or priorityQueue and assing it to quoues 
		 * 
		 */
		// adding elemts to queuse 
		Queue<String>q=new LinkedList<String>();
		q.add("Rick");
		q.add("Maggie ");
		q.add("Glenn");
		q.add("Negan");
		q.add("Daryl");
		
		System.out.println("Elements in queuse: "+q);
		/*we can remove elemnts from queue using remove ()method ,
		 * this would remove the first elemnts from quesue 
		 */
		System.out.println("Remove elements: "+q.remove());
		
		/*elements ()method -this returns the head of the queue . head  is the first elemnt of queue
		 */
		System.out.println("Head: "+q.element());
		/*poll() method - this removes and returns the head of the queue . return null if the qoueue is empty*/
		System.out.println("poll(): "+q.poll());
		/*pee() method - it works same as elements () method ,
		 * however it returns null if the queue is empty 
		 */
		System.out.println("peek(): "+q.peek());
		//Again displaying the elements of queus 
		System.out.println("Elements in queue : "+q);
		

	}

}
