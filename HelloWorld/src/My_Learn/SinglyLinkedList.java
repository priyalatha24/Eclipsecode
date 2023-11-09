package My_Learn;

import java.util.*;

import java.util.LinkedList;

public class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head; // head should be a member of SinglyLinkedList, not linkedList

    // insert at the start
    public void insertStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // insert at middle(use temp)
    public void insertMiddle(int data, int position) {
        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("displaying the middle position");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // insert at end
    public void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        // insert at start
        linkedList.insertStart(1);
        linkedList.insertStart(2);
        linkedList.insertStart(3);

        // insert at middle
        linkedList.insertMiddle(4, 2);

        // insert at end
        linkedList.insertEnd(5);

        // print the linked list
        printlList(linkedList.head);
    }

    // Helper method to print the linked list
    public static void printlList(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


