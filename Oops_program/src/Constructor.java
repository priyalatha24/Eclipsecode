import java.util.Scanner;

public class Constructor {
	// Constructor method 
	int emp_id,salary;
	String emp_name;
	Constructor(){ 
		// default construtor - empty insde the constructor method /no parameter inside method 
		emp_id = 1;
		emp_name ="celine";
		salary = 20000;
	}
	// more then 1 construtor can wrt but inside thw input should not be same 
	Constructor(int id,String name, int sal){ // parameterized constructor  
		emp_id = id;
		emp_name = name;
		salary = sal;
	}
	void display() {
		System.out.println("Employee details: ");
		System.out.println("Emp_id: "+emp_id);
		System.out.println("Emp_name: "+emp_name);
		System.out.println("salary: "+salary);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int id, salary; String name;
		System.out.println("Employee id: ");
		id = s.nextInt();
		System.out.println("Employee name: ");
		name = s.next();
		System.out.println("Salary: ");
		salary = s.nextInt();
		Constructor obj = new Constructor();
		obj.display();
		Constructor obj1 = new Constructor(2,"vinod",25000);
				obj1.display();
				Constructor obj2 = new Constructor(2,"dior",2000000);
				obj2.display();
				
		
		

	}

}
