package Abstraction_sums;
//Abstract class shape 
abstract class Shape{
	abstract double calculateArea1();
	abstract double calculatePerimeter();
	}
//subclass circle
	
class Circle extends Shape{
	private  double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

   @Override
	double calculateArea1() {
	   return Math.PI*radius*radius;
	}

    double calculatePerimeter() {
	return  2* Math.PI*radius;
}	
}
 //Subclass Triangle 
class Triangle1 extends Shape{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle1(double side1,double side2,double side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	@Override
	double calculateArea1() {
		double s = (side1+side2+side3)/2 ;      // semi perimeter
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	
	@Override
	double calculatePerimeter() {
		return side1+side2+side3;
	}


public class Abs_Shape_sum {

	public static void main(String[] args) {
		double r =4.0;
		Circle c = new Circle(r);
		double ts1 = 3.0, ts2 = 4.0, ts3=5.0;
		Triangle1 t = new Triangle1(ts1,ts2,ts3);
		System.out.println("Radius of the Circle"+r);
		System.out.println("Area of the Circle: "+c.calculateArea1());
		System.out.println("Perimeter of the circle : "+c.calculatePerimeter());
		System.out.println("Sides of the triangle are : "+ts1+','+ts2+","+ts3);
		System.out.println("Area of the Triangle: "+t.calculateArea1());
		System.out.println("Area of perimeter: "+t.calculatePerimeter());	
	
	}
}}


