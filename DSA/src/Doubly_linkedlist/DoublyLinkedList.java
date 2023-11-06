package Doubly_linkedlist;

public class DoublyLinkedList {
	class Node{
		//stores data 
		public int data ;
		//pointer to the next node 
		public Node next = null;
		// pointer to the previoes node e
		public Node prev=null;
		public Node(int data) {
			this.data=data;
		}
	}
	Node head=null;
	Node tail=null;
	public void addNodefront(int val) {
		Node temp=new Node(val);
		if(head!=null) {
			head.prev=temp;
			temp.next=head;
		}
		head=temp;
		if(tail==null) {
			tail=temp;
		}}
	public void addNodeBack(int val) {
		Node temp = new Node(val);
		if(tail !=null) {
			tail.next=temp;
			temp.prev=tail;
		}
		tail =temp;
		if(head == null)
		{
			head=temp;
		}
		System.out.println("New node added at the end : "+val);
		
	}
	public int removeNodeFront() {
		Node temp=head;
		head=head.next;
		head.prev = null;
		System.out.println("deleted: "+temp.data);
		return temp.data;
	}
	public void removeNodeBack() {
		Node temp = head;
		tail =tail.prev;
		tail.next=null;
		System.out.println("deleted: "+temp.data);
			
		}
	
		public void iterateForward() {
			Node temp= head;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}	
		
	}
		public void iterateBackward() {
			Node temp= tail;
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}	
		
	}
		public static void main(String[] args) {
			DoublyLinkedList dll= new DoublyLinkedList();
			dll.addNodefront(2);
			dll.addNodefront(100);
			dll.addNodeBack(1200);
			dll.addNodeBack(5000);
			dll.addNodeBack(900);
			System.out.println("Doubly linked list before remove: ");
			dll.iterateForward();
			dll.removeNodeFront();
			System.out.println("Doubly linked list after remove front: ");
			dll.iterateForward();
			dll.removeNodeBack();
			System.out.println("Doubly linked list after remove back: ");
			dll.iterateForward();
			System.out.println("Iterate backward: ");
			dll.iterateForward();
		
		}

	}