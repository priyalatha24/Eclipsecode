package Rough;
class square{
	protected double length, breadth;
	square(double length, double breadth){
		this.length = length;
		this.breadth = breadth;
		System.out.println("Length=" +length + "Breadth=" +breadth);
		}
}
public class Cube extends square {
	double hei;
	Cube(double length, double breadth, double hei){
		super(length,breadth);
		this.hei = hei;
		
		System.out.println("Height: "+hei);
	}

	public static void main(String[] args) {
		Cube obj = new Cube(4,6,7);
	}

}
