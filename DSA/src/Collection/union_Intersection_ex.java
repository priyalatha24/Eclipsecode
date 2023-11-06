package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class union_Intersection_ex {

	public static void main(String[] args) {
		Integer[]A = {1,2,3,4,5};
		Integer[]B = {5,3,6,7,9};
		
		Set<Integer>set1 = new HashSet<Integer>();
		set1.addAll(Arrays.asList(A));
		
		Set<Integer>set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));
		
		//Finding uninon set 1 and set2
		Set<Integer>union_data = new HashSet<Integer>(set1);
		union_data.addAll(set2);
		System.out.print("Union of set1 and  set2 is : ");
		System.out.println(union_data);
		
		//Finding intersection of set1 and set2
				Set<Integer>intersection_data = new HashSet<Integer>(set1);
				intersection_data.retainAll(set2);
				System.out.print("Intersection of set1 and set2 is : ");
				System.out.println(intersection_data);
				
	    //Finding difference of set 1 and set2
		Set<Integer>difference_data = new HashSet<Integer>(set1);
	    difference_data.removeAll(set2);
		System.out.print("DIfferece of set1 and set2 is: ");
		System.out.println(difference_data);
		

	}

}
