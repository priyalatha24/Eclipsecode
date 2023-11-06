package Stack;

import java.util.Stack;

public class TopElement_fromStack {

	public static void main(String[] args) {
		//display top from stack 
		Stack<String> stk = new Stack<>();
			//pushing elements into stack 
			stk.push("Apple");
			stk.push("Grapes");
			stk.push("Mango");
			stk.push("Orange");
			System.out.println("Stack:"+stk);
			//Access elemts from top to stack 
			String fruits  = stk.peek();
			//prints stack 
			System.out.println("Elemets at top: "+fruits);
		}

	}


