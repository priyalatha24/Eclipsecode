abstract class Shape{
	abstract void draw();
}
// in real scenairoio , implemnetation  is provided by othersi.e unknown by end useer 
class Rectangle extends Shape{
	void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle1 extends Shape{
	void draw() {
		System.out.println("drawing circle");
	}
}
// in real sceaniro , method is called by programmer  or user 
public class TestAbstraction1 {

	public static void main(String[] args) {
		Shape s =new Circle1();
		Shape r = new Rectangle();
		
		// in real scenairio , obje is provided  via method , e.g.,getShape()method
		s.draw();
		r.draw();
	}

}
