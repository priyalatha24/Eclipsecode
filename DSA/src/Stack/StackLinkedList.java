package Stack;

import java.util.EmptyStackException;
import java.util.Scanner;

import java.util.LinkedList;
import java.util.Scanner;

import java.util.LinkedList;
import java.util.Scanner;

class LinkedStack {
    private LinkedList<Integer> stack;

    public LinkedStack() {
        stack = new LinkedList<>();
    }

    public void push(int element) {
        stack.push(element);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Error: Underflow Exception");
        }
        return stack.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Error: Underflow Exception");
        }
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public void display() {
        System.out.println("Stack = " + stack);
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        Scanner scanner = new Scanner(System.in);

        char choice;
        do {
            System.out.println("Linked Stack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. size");

            int option;
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter integer element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    stack.display();
                    break;
                case 2:
                    try {
                        int poppedElement = stack.pop();
                        System.out.println("Popped Element = " + poppedElement);
                        stack.display();
                    } catch (IllegalStateException e) {
                        System.out.println("Error: Underflow Exception");
                    }
                    break;
                case 3:
                    try {
                        int peekedElement = stack.peek();
                        System.out.println("Peek Element = " + peekedElement);
                        stack.display();
                    } catch (IllegalStateException e) {
                        System.out.println("Error: Underflow Exception");
                    }
                    break;
                case 4:
                    System.out.println("Empty status = " + stack.isEmpty());
                    stack.display();
                    break;
                case 5:
                    System.out.println("Size = " + stack.size());
                    stack.display();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("Do you want to continue (Type y or n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }
}

