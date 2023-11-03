package Access_modifier;

public class File1 {
	public int a =10;
	// class variabel - default access modifier 
	// default - visible inside rhe package 
	private int b =20;
	// private modifier is visisble inside the class, 
	public void display() {
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	
	}

}
