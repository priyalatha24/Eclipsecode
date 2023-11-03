class Person1{
	private String name;
	private int age ;
	private String country;
	
	public String getName1() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setName(String newValue) {
		name = newValue;
	}
	public void setAge( int newValue) {
		age = newValue;
	}
	
	public void setCountry(String newValue) {
		country = newValue;
	}
}
public class PersonSum_encapsulation {

	public static void main(String[] args) {
		Person1 obj = new Person1();
		obj.setName("Mario");
		obj.setAge(32);
		obj.setCountry("berlin");
		System.out.println("Name: "+obj.getName1());
		System.out.println("Age: "+obj.getAge());
		System.out.println("Country: "+obj.getCountry());

	}	
	}


