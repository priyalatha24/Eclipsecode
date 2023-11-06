package Stack;

import java.util.NoSuchElementException;

public class Stack_joins_linkedlist
{
	class Node {
		protected int data;
		protected Node link;
		//contructor 
		public Node()
		{
			link = null;
			data = 0;
		}
		//constructor
		public Node(int d , Node n) 
		{
			data =d ;
			link = n;
		}
		//fuction to set link to next node 
		public void setLink(Node n)
		{
			link = n;
		}
		//func to set data to cuurent node 
		public void setData(int d )
		{
			data = d ;
		}
		//func to get link to next node 
		public Node getLink()
		{
			return link;
		}
		//func to get data from current node 
		public int getData()
		{
			return data ;
		}
		
	}
	//clads linked stack 
	class linkedStack
	{
		protected Node top;
		protected int size ;
		
		//constructor 
		public linkedStack()
		{
			top = null;
			size = 0;
		}
		//func to check if the stack is empty 
		public boolean isEmpty()
		{
			return top == null;
		}
		//func to get the size of the stack 
		public int getsize()
		{
			return size;
		}
		//func to push to element to the stack 
		public void push (int data )
		{
			Node obj = new Node(data , null);
			if(top == null)
				top = obj;
			else
			{
				obj.setLink(top);
				top = obj;
			}
			size++;
			
		}
		//func to pop an element from the stack 
		public int pop()
		{
			if(isEmpty())
				throw  new NoSuchElementException("Under flow exception ");
			Node ptr = top;
			top =ptr.getLink();
			size--;
			return ptr.getData();
		}
		//func to check the top element of the stack
		public int peek ()
		{
			if(isEmpty())
				throw new NoSuchElementException("Underflow exception");
			return top.getData();
		}
		//func to display the status of the stack 
		public void display()
		{
			System.out.print("\nStack = ");
			if(size == 0)
			{
				System.out.print("Empty\n");
				return;
			}
			Node ptr =top ;
			while(ptr !=null)
			{
				System.out.print(ptr.getData()+" ");
				ptr =ptr.getLink();
			}
			System.out.println();
		}
		//class linkedstackimplement
		public class LinkedStackImplement
		{
		
	public static void main(String[] args)
	{
		Scanner s = new Scanner (System.in);
		//creating obj of class linkedstack 
		linkedStack Ls

	}

}
