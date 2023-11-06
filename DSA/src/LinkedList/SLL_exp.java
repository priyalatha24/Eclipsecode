package LinkedList;

import LinkedList.Singly_linkedlist.Node;

public class SLL_exp {
	class Node{
		int data ;
		Node next;
		public Node(int d){
			this.data =d;
			this.next =null;
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
			//deletefrontnode 
			public void deleteNodeFront() {
		        // Check if the list is empty
		        if (head == null) {
		            System.out.println("The list is empty. Cannot delete from an empty list.");
		            return;
		        }

		        // Move the head to the next node
		        head = head.next;
		    }
			
			//add InBetweeen
			public void inBetween(int i, int j) {
				
				
			}
			
			// deleteElement
			public void deleteElement(int data) {
				Node temp = head;
				if(head==null)
					System.out.println("List is empty");
				else {
					if(temp.data==data ) {
						temp=temp.next;
						head=temp;
					}
					else {
						while(temp.next.data!=data) {
							temp=temp.next;
						}
						if(temp.next==null)
							System.out.println("elements is not present in the list");
						else {
							temp.next=temp.next.next;
						}
					}
				}
			}
			
			//deleteBackNode 
			 public void deleteNodeBack() {
				 if(head == null)
						return;
					else {
						if(head!= tail) {
							Node current = head;
							while(current.next != tail) {
								current = current.next;
							}
							tail = current;
							tail.next =null;
							
						}
						else {
							head = tail = null;
						}
					}
			    }
			 /*deletefirst
			  * Node temp = head ;
			  * if(head == null)
			  * System.out.println("List is empty");
			  * else{
			  * head = head.next;
			  * }
			  * dleletelast 
			  * Node temp = head;
			  * if(head== null)
			  * System.out.println("List is empty");
			  * else{
			  * while(temp.next!=tail){
			  * temp=temp.next;
			  * }
			  * temp.next=null;
			  * tail=temp;
			  */
			  

	public void display() {
		Node current = head;
		if(head==null) {
			System.out.println("Linked list is empty");
		}else {
			
			while(current!=null) {
				System.out.print(current.data+" ");
				
				current=current.next;
			}
		}
	}
	

	public static void main(String[] args) {
		SLL_exp ssl = new SLL_exp();
		ssl.addNode(2);
		ssl.addNode(4);
		ssl.addFirst(6);
		ssl.addLast(10);
		ssl.addNode(12);
		System.out.println("Singly linked list elements are: ");
		ssl.display();
		ssl.deleteNodeFront();
		ssl.deleteNodeBack();
		System.out.println("\nSingly linked list elements are: ");
		ssl.display();
		ssl.inBetween(5,9);
		ssl.deleteElement(4);
		ssl.display();
		

	}
	
		
	}


