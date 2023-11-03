//abstract class 
abstract class Sum{
	/*these 2 are abstractmethod , the child class 
	 * must implement these methods 
	 */
	public abstract int sumOfTwo(int n1,int n2);
	public abstract int sumOfThree(int n1,int n2,int n3);
	
	// Regular method
	public void disp() {
		System.out.println("Method of class sum");
	}
}
//Regular class extends Abstract class 
public  class Demoabstraction  extends Sum{
/*if  i dont provide the implementation of these two methods , the 
 * program will throw complilation error 
 */
	public int sumOfTwo(int num1, int num2) {
		return num1+num2;
	}
	public int sumOfThree(int num1, int num2,int num3) {
		return num1+num2+num3;
	}
	
	public static void main(String[] args) {
		Sum obj = new  Demoabstraction();
		System.out.println(obj.sumOfTwo(3,7));
		System.out.println(obj.sumOfThree(1,4,3));
		obj.disp();


	}

}
