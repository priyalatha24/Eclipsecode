package Wrapperclass;

public class Wrapper_primitive {

	public static void main(String[] args) {
		// wrapper promitive 
		// create primitive types
		int var1=5;
		double var2 = 5.65;
		boolean var3=true;
		
		//converts into wrapper objects 
		Integer obj1 = Integer.valueOf(var1);
		Double obj2 = Double.valueOf(var2);
		Boolean obj3 = Boolean.valueOf(var3);
		
		// converts if obj are objecats of corresponding wrapper class 
		if(obj1 instanceof Integer) {
			System.out.println("An obj of integer is created.");
		}
		if(obj2 instanceof Double) {
			System.out.println("An obj of Double is created.");
		}
		if(obj3 instanceof Boolean) {
			System.out.println("An obj of Boolean is created.");
		}



	}

}
