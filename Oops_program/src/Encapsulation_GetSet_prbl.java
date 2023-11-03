import java.util.Scanner;

class Encapsulation{
	private String Name;
	private int Age;
	private String Country;
	
	//Getter and setter methods 
	public String getName() {       //return - getter =>to receive /get the value (getname) get word 
		return Name;
	}
	
	public int getAge() {
		return Age;
	}
	
	public String getCountry() {
		return Country;
	}
	// setter method 
	public void setName(String newValue) {
		Name = newValue;
	}
	
	public void setAge(int newValue) {    // set word =>to assign value 
		Age = newValue;
	}
	
	public void setCountry(String newValue) {
	      Country = newValue;
	}
	
}
public class Encapsulation_GetSet_prbl {

	public static void main(String[] args) {
		// Encapsulation getter and setter 
		Encapsulation obj = new Encapsulation();
		Scanner s =new Scanner(System.in);
		String Name=s.nextLine();
		int Age=s.nextInt();
		String Country=s.next();
		
		obj.setName(Name);
		obj.setAge(Age);
		obj.setCountry(Country);
		System.out.println("Name: "+obj.getName());
		System.out.println("Age: "+obj.getAge());
		System.out.println("Country: "+obj.getCountry());
		

	}

}
