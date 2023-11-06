package Collection;

import java.util.ArrayList;

public class Addremove_method {

	public static void main(String[] args) {
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Steve");
		alist.add("Tim");
		alist.add("Lucy");
		alist.add("Pat");
		alist.add("Angela");
		alist.add("Tom");
		
		//displaying elemts 
		System.out.println(alist);
		
		//Removung "Steave "and "Angela"
		alist.remove("Steve");
		alist.remove("Angela");
		
		//displaying elements
		System.out.println(alist);
		
		//Removing 3rd elements -pat
		alist.remove(2);
		
		//displaying eleemts 
		System.out.println(alist);
		
		//iteration 
		for(String str:alist)
			System.out.println(str);
		
		//how many array size list 
		System.out.println("Number of elemets in ArrayList: "+alist.size());

	}

}
