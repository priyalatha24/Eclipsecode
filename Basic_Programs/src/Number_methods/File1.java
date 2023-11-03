package Number_methods;

public class File1 {

	public static void main(String[] args) {
		// wrapper class 
		// converts integer objects into float / double objects 
		Integer x = 10;
		Float f = x.floatValue();
		System.out.println(x.floatValue());
		System.out.println("f = "+f);
		
		//converting primitive to objectes 
		String str = "10";// primitive datatypes 
		Integer y = Integer.parseInt(str);
		Double d = y.doubleValue(); // D caps - object
		System.out.println("y = "+y);
		System.out.println("d = "+d);
		//String str2=d.toString();
		System.out.println(d.toString());
		System.out.println(String.valueOf(str));
		// compare to 3 numbers 
		Integer num1 = 10;
		Integer num2 =10;
		System.out.println(num1.compareTo(num2));
		System.out.println(num1.equals(num2));
		
		String a= "hello";
		String b="hello";
		if(a.equals(b))
			System.out.println("Both strings are equal");
		
		if(a.compareTo(b)==0)
			System.out.println("Both strings are equal");
		
		Double f1=-20.45;
		System.out.println("abs = "+Math.abs(4-7));
		System.out.println("ceil = "+Math.ceil(f1));
		System.out.println("round = "+Math.round(f1));
		System.out.println("Floor= "+Math.floor(f1));
		
		System.out.println("Minimum value= "+Math.min(12, 24));
		System.out.println("Maximum  value= "+Math.max(12, 24));
		System.out.println(Math.pow(2, 3));
		
		
		System.out.println(Character.isLetter('5')); //false
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isLowerCase('\n'));
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isUpperCase('B'));
		
		//String method 
		String str2 ="Welcome";//A-65 W=87
		String str3 ="welcome";//a-97w-119
		System.out.println(str2.charAt(5));
		//System.out.println(str3.charAt(10));
		System.out.println(str2.compareTo(str3));//-32 =87-119
		System.out.println(str2.compareToIgnoreCase(str3));
		
		System.out.println(str2.concat(str3));
		System.out.println(str2.length());
		System.out.println(str2.substring(4));
		System.out.println(str2.substring(2,7));
		System.out.println(str2.replace('e','a' ));
	
				
	}

}
