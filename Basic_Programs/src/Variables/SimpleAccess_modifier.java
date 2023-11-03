package Variables;

class A {
    public static final char[] A = null;
    private int a = 10;
    int[] b = new int[20]; // Fixed the array declaration
    // Corrected the display method to print correctly
    void display() {
        System.out.println("a = " + a);
        System.out.println("b = " + b); // Fixed the parentheses and added " + b" to print the array
    }
}

public class SimpleAccess_modifier {
    public static void main(String[] args) {
        A obj = new A(); // Corrected the object creation
        obj.display(); // Corrected the method name to "display()"
        System.out.println(obj.A);
    }
}
