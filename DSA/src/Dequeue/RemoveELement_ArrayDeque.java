package Dequeue;

import java.util.ArrayDeque;

public class RemoveELement_ArrayDeque {
	
	public static void main(String []args ) {
		ArrayDeque<String>animals = new ArrayDeque<>();
		animals.add("Dog");
		animals.add("cat");
		animals.add("cow");
		animals.add("hell");
		animals.add("Hen");
		animals.add("Lion");
		System.out.println("ArrayDeque:"+animals);
		
		//Using remove ()
		String element = animals.remove();
		System.out.println("Removed Eleemnt:"+element);
		
		System.out.println("New ArrayDeque: "+animals);
		
		//Using remove(element)
         animals.remove("cow");
         System.out.println("New ArrayDeque: "+animals);
 		
		//String specificelement=animals.remove("cow");
		//System.out.println("Removed specificelement"+specificelement);
		
		//using remove first()
		String firstElement=animals.removeFirst();
		System.out.println("removed "+firstElement);
		
		//using removeLast()
				String lastElement=animals.removeLast();
				System.out.println("removed last "+lastElement);
				
				System.out.println("New ArrayDeque:"+animals);
				animals.clear();
				System.out.println("New ArrayDeque: "+animals); 
				
				
	}

}
