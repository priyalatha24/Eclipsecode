package Inheritance;


//Parent class Employee
public class Emp {
 private int salary;

 public Emp(int salary) {
     this.salary = salary;
 }

 public void work() {
     System.out.println("working as an employee!");
     return;
     
 }

 public int getSalary() {
     return salary;
 }
}
