package Collection;

import java.util.*;

public class DequeArray_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String>dq = new ArrayDeque<String>();
		dq.add("Rick");
		dq.add("Maggie ");
		dq.add("Glenn");
		dq.add("Negan");
		dq.add("Daryl");
		System.out.println("Elements in deque: "+dq); 
		System.out.println("Remove elemnets : "+dq.removeLast());
		System.out.println("Head: "+dq.element());
		/*pollLast() method - this method removes and returns the tain of the deque (last element).
		 * returns null id the deques is empty 
		 * we can also use poll () or poll First () remove the 1st elements of deques 
		 */
		System.out.println("poll():"+dq.pollLast());
		/*peek() method - it works same as elements () method ,
		 * however it returns null if the deque is empty . 
		 * we can also use 
		 * peekFirst()  and peekLast() to retrieve first and last elements 
		 */
		System.out.println("peek() :"+dq.peek());
		//Again printing the elements of deques 
		System.out.println("Elemnts in deque: "+dq);

	}

}
