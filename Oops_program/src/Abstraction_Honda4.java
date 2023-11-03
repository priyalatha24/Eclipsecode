abstract class Bike{
	abstract void run();
	void display() {
		System.out.println("Non abstract method ");
	}
}

public class Abstraction_Honda4 extends Bike{
	void run () {
		System.out.println("running safely");
	}

	public static void main(String[] args) {
		// Abstraction 
		Bike obj = new Abstraction_Honda4();
		obj.display();
		obj.run();
		
	}

}
