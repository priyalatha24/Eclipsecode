package Variables;

public class Static_variable {

    // Static variable
    // Static member of the outer class
    private static char grade = 'A';

    static void test() { // Static method
        System.out.println("Grade: Inside static nested class: " + grade);
    }

    // Static nested class
    static class Nested {

        // Non-static method
        public void fun() {
            // Nested class can access the static members of the outer class
            System.out.println("Grade: Inside Nested class: " + grade);
        }
    }

    public class Check {
        void display() {
            System.out.println("Check class Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Static_variable.Nested obj = new Static_variable.Nested();

        obj.fun(); // Call the non-static method of the static nested class
        System.out.println("Static variable: " + grade); // Access the static variable
        test(); // Call the static method inside the outer class

        Static_variable.Check ck = new Static_variable().new Check();
        ck.display(); // Call the method in the inner class
    }
}
