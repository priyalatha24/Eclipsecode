package Bp_integerprogram;

public class BpFile1 {
	
	public static void main(String[] args) {
		//integer program 
		int a,b,add;//variable declaration 
		a=10;// variable initialization 
		 b=20;// variable declaration &initialization 
		// a & b are called as identifier - variable identifier
		System.out.println(a+b);// 10+20=30
		System.out.println(a-b);// substraction
		System.out.println(a*b);// muiltiply
		System.out.println(a/b);//division
		//add = a+b;
		//System.out.println(add);
		System.out.println("Addition = "+ (a+b));// addition = 30 is output 
		System.out.println("Substraction ="+(a-b));
		System.out.println("Muiltiplication ="+(a*b));
		System.out.println("Division="+ (a/b));
		/*Addition =30
		  substraction = -10
		  Muiltiplication = 200
		  Division = 0
		 */
		System.out.println("Another way of printing: ");
		System.out.println("Addition="+ (a+b)
	    +",\n"+"Substraction= "+(a-b)
	    +",\n"+"Muiltiply="+(a*b)
	    +",\n"+"Division="+(a/b)+"."); 
		
	}

}
