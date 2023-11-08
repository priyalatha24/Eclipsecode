package example;

import example.logic.ArrayLogic;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {8,6,9,2,8,10,23,34,567,456,32,6};
		ArrayLogic al = new ArrayLogic();
		
		System.out.println("min: "+al.minArray(a));
		System.out.println("Max: "+al.maxArray(a));
		System.out.println("Find: "+al.findArray(a,10));
		int  primeNumber = 0;
		System.out.println("Prime number : "+primeNumber);
		al.arrayPrimenumber(a);

	}

}
