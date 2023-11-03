interface MyInterface
{
	public void method1(); 
	public void method2();
	/*compiler will reat them as :
	 * public abstract void method1();
	 * public abstract void method2 ();
	 */
}
public class Demo2abstraction implements MyInterface{
	public void method1() {
		System.out.println("implemnets of method1");
	}
	
	public void method2() {
		System.out.println("implemnets of method2");
	}

	public static void main(String[] args) {
		MyInterface obj = new Demo2abstraction();
		obj.method1();
		

	}

	
	}


