package Javatry;

import java.util.ArrayList;

public class FindEven {
	public ArrayList<Integer> even(int a[]){
		ArrayList<Integer> E= new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
				E.add(a[i]);
				}
		return E;
     }
	
}
