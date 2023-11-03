package Looping;

public class For_each_array {

	public static void main(String[] args) {
		// For each loop 
		int []numbers= {10,20,30,40,50};
		
		for(int x : numbers) {
			System.out.print (x);
			System.out.print(",");
		}
		System.out.println("\n");
		String[]names= {"james","larry","tom","Laxy"};
		for(String name : names ){
		System.out.print(name);
		System.out.print(",");
		}

	}

}
