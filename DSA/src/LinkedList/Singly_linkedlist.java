package LinkedList;

public class Singly_linkedlist {
	class Node{
		int data;
		Node next;// link generation //next - object 
		public Node( int data) {
			this.data=data;
			this.next=null; // null is connecting keyword inbuilt keyword 
		}
	}
		public Node head = null;      // head will be the 1st position , current is assigning value for moving to last node tail.
		public Node tail=null;
		void addNode(int data) {
			Node newNode=new Node(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode; // new node connnecting 
				tail=newNode; // moving to next node tail
			}
	}
		//inserting at first
		void addFirst(int data) {
			Node newNode =new Node(data);
			if(head==null) {
				head = newNode;
				tail=newNode;
			}
			else {
				//head= newNode do not give like this it replaces tha 1st node here no replace but adding at the first .
				newNode.next=head;
				head=newNode;
				
			}
		}
		//Insert at end   atlast
		void addLast(int data) {
			Node newNode = new Node(data);
			Node current = head;
			if(head==null) {
				head=newNode;
				head=newNode;
			}
			else {/*
				while(current.next!=null) {
					current=current.next;
				}
				current.next=newNode;*/
				tail.next=newNode; //can give like this 
				tail=newNode;
			}
		}
		//insert inBetween 
		void addBetween(int pos,int data) {//pos=20,data=78
			Node newNode=new Node(data);
			Node current=head;
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else {
				while(current.data!=pos) {
					current=current.next;
				}
				//current.next=newNode;
				newNode.next=current.next;
				current.next=newNode;	
			}
		}
		public void display() {
			Node current = head;
			if(head==null) {
				System.out.println("Linked list is empty");
			}else {
				System.out.println("Singly linked list elements are: ");
				while(current!=null) {
					System.out.print(current.data+" ");
					current=current.next;
				}
			}
		}

	public static void main(String[] args) {
		Singly_linkedlist sll = new Singly_linkedlist();
		sll.addNode(10);
		sll.addNode(5);
		
		sll.addNode(20);
		sll.addLast(500);
		sll.addFirst(100);
		//sll.addLast(500);
		sll.addNode(20);
		sll.display();
		
	}

}
