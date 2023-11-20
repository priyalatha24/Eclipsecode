package Inheritance;

//Child class HRManager
public class Ex2 extends Emp {
 public Ex2(int salary) {
     super(salary);
 }

 public void work() {
     System.out.println("\nManaging employees");
     return;
     
 }

 public void addEmp() {
     System.out.println("\nAdding new employee!");
     return ;
 }
}
