package Vector;

import java.util.*;

public class Vector_ex {

	public static void main(String[] args) {
		// Vector of initial capacity(size)of 2
		Vector<String> vec = new Vector<String>(2);
		
		//Adding elements to a vector 
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("mango");
		vec.addElement("fig");
		
		//check size and capacity incremenets 
		System.out.println("Size is : "+vec.size());
		System.out.println("Default capacity incremenet is : "+vec.capacity());
		
		vec.addElement("fruit1");
		vec.addElement("fruit2");
		vec.addElement("fruit3");
		
		//size and capacity incremenet after two insertion 
		System.out.println("Size after addition : "+vec.size());
		System.out.println("Capacity after increment is : "+vec.capacity());
		
		//Display vector elements 
		Enumeration en = vec.elements();
		System.out.println("\nElements are:");
		while(en.hasMoreElements())
			System.out.print(en.nextElement()+" ");
		
	}

}
