package Queue;
import java.util.NoSuchElementException;
import java.util.Scanner;

class Node {
    protected int data;
    protected Node link;

    public Node() {
        link = null;
        data = 0;
    }

    public Node(int d, Node n) {
        data = d;
        link = n;
    }

    public void setLink(Node n) {
        link = n;
    }

    public void setData(int d) {
        data = d;
    }

    public Node getLink() {
        return link;
    }

    public int getData() {
        return data;
    }
}

class LinkedQueue {
    protected Node front, rear;
    public int size;

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getSize() {
        return size;
    }

    public void insert(int data) {
        Node nptr = new Node(data, null);
        if (rear == null) {
            front = nptr;
            rear = nptr;
        } else {
            rear.setLink(nptr);
            rear = nptr;
        }
        size++;
    }

    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        return front.getData();
    }

    public int remove() {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        Node ptr = front;
        front = ptr.getLink();
        if (front == null)
            rear = null;
        size--;
        return ptr.getData();
    }

    public void display() {
        System.out.print("Queue = ");
        if (size == 0) {
            System.out.println("Empty");
            return;
        }
        Node ptr = front;
        while (ptr != null) {
            System.out.print(ptr.getData() + " ");
            ptr = ptr.getLink();
        }
        System.out.println();
    }
}

public class LinkedQueueImplement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedQueue lq = new LinkedQueue();
        System.out.println("Linked Queue Test\n");
        char ch;
        do {
            System.out.println("\nQueue Operations");
            System.out.println("1. insert");
            System.out.println("2. remove");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to insert");
                    lq.insert(s.nextInt());
                    break;
                case 2:
                    try {
                        System.out.println("Removed element = " + lq.remove());
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Peek element = " + lq.peek());
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Empty status = " + lq.isEmpty());
                    break;
                case 5:
                    System.out.println("Size = " + lq.getSize());
                    break;
                default:
                    System.out.println("Wrong Entry\n");
                    break;
            }
            lq.display();
            System.out.println("\nDo you want to continue (Type y or n)\n");
            ch = s.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}
