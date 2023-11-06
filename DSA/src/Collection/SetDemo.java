package Collection;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		int count[]= {34,22,10,60,30,22}; //Interger Array - count 
		Set<Integer> set = new HashSet<Integer>();
		for(int i =0;i<count.length;i++) {
			set.add(count[i]);
			
		}
		System.out.println(set);
		TreeSet<Integer> sortedSet/*obj*/ = new TreeSet<Integer>(set); // integer -datatype indicating 
		System.out.println("The sorted list is : ");
		System.out.println(sortedSet);
		System.out.println("The first elements of the set is : "+/*obj*/sortedSet.first()); // first elements 
		System.out.println("The last elements of the set is : "+(Integer)sortedSet.last()); // last elemets  , check integer is given 

	}

}
// set - doesnt maintain insertion set in output that we have given in ( int count ={ } )