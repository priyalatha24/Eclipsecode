package Stack;

import java.util.Stack;

public class StsckEmptyMethodEx {

	public static void main(String[] args) {
		//creating an instance of stack class 
		Stack<Integer> stk =new Stack<>();
		//checking stack is empty or not 
		boolean result = stk.empty();
		System.out.println("Is the stak empty?"+result);
		//pushing element into  stack 
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		//prints elements of the stack 
		System.out.println("Element in Stack: "+stk);
		result = stk.empty();
		System.out.println("Is the stack empty? "+result);

	}

}
