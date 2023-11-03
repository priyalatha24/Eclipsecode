package Variables;

public class Local_variable {
    int b = 100;

    public void Local_variable() {
        int a = 10; // class variable - default access modifier
        // visible inside the package
        System.out.println("local a = " + a); // Corrected variable name from "b" to "a"
        System.out.println("local b = " + b);
    }

    void display() {
        System.out.println("display b = " + b);
    }

    public static void main(String[] args) {
        Local_variable obj = new Local_variable();
        obj.Local_variable(); // Changed "obj.local) var();" to "obj.Local_variable();"
        obj.display();
    }
}
