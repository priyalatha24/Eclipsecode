package Problem;

import java.util.Stack;

public class StackUsingStringMethod {

	
		static void reversePrint(Stack<Integer> s) {
			if(s.isEmpty())
				return;
			int x=s.peek();
			s.pop();
			System.out.print(x+" ");
			reversePrint(s);
			s.push(x);
		}

		public static void main(String[] args) {
			Stack<Integer> st=new Stack<Integer>();
			st.push(24);
			st.push(5);
			st.push(11);
			st.push(36);
			
			System.out.println("Stack Element in forward: ");
			System.out.println(st);
			System.out.println("Stack Element in reverse: ");
			reversePrint(st);
			System.out.println();
			System.out.println(st);
		}

	}