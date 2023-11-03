import java.util.Scanner;

class salary{
	
	private int ID;
	private String Name;
	private Double Salary;
	
	
	public int getID() {
		return ID;
	}
	public String getName() {
		return Name;
	}
	public Double getSalary() {
		return Salary;
	}
	//setter 
	
	public void setID(int newValue) {
		ID = newValue;
	}
	public void setName(String newValue) {
		Name = newValue;
	}
	public void setSalary(Double newValue) {
		Salary = newValue;
	}
}
public class Salarysum_encaps {

	public static void main(String[] args) {
		salary obj = new salary();
		Scanner s=new Scanner(System.in);
		
		int ID=s.nextInt();
		s.nextLine();
		String Name=s.nextLine();
		Double Salary=s.nextDouble();
		
		obj.setID(ID);
		obj.setName(Name);
		obj.setSalary(Salary);
		
		System.out.println("Employee Details : ");
		System.out.println("ID: "+obj.getID());
		System.out.println("Name: "+obj.getName());
		System.out.printf("Salary : $ %.2f ",obj.getSalary());
		

	}

}
