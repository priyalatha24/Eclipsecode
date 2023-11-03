class EncapsulationDemo{
	private int ssn;
	private String empName;
	private int empAge;
	
	//Getter and setter methods 
	public int getEmpSSN() {       //return - getter =>to receive /get the value (getempssn ) get word 
		return ssn;
	}
	
	public String getEmpName1() {
		return empName;
	}
	
	public int getEmpAge() {
		return empAge;
	}
	
	public void setEmpAge(int newValue) {
		empAge = newValue;
	}
	
	public void setEmpName1(String newValue) {    // set word =>to assign value 
		empName = newValue;
	}
	
	public void setEmpSSN(int newValue) {
		ssn = newValue;
	}
	
}
public class Encapstest {

	public static void main(String[] args) {
		// encapstest
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpName1("Mario");
		obj.setEmpAge(32);
		obj.setEmpSSN(112233);
		System.out.println("Employee Name: "+obj.getEmpName1());
		System.out.println("Employee Name: "+obj.getEmpSSN());
		System.out.println("Employee Name: "+obj.getEmpAge());
		

	}

}
