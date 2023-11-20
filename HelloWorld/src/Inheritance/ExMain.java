package Inheritance;

public class ExMain {

	public static void main(String[] args) {
	        Emp emp = new Emp(40000);
	        Ex2 mgr = new Ex2(70000);

	        emp.work();
	        System.out.println("Employee salary: " + emp.getSalary());

	        mgr.work();
	        System.out.println("Manager salary: " + mgr.getSalary());
	        mgr.addEmp();
	    }

	}


