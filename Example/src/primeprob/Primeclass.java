package primeprob;

import java.util.ArrayList;

public class Primeclass {
	public ArrayList<Integer>primenumber(int arr[] ) {
		ArrayList<Integer> ar=new  ArrayList<Integer>(); 
		int count =0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j == 0)
					count++;
			}
			if(count == 0 && arr[i] != 1)
				ar.add(arr[i]);
			count =0;
		}
		return ar;
			
	}
}
