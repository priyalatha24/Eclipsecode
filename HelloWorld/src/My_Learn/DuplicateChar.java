package My_Learn;

import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		String s ="Priyaaa";
		//char ch;
		//int z ;
		char[] a= s.toCharArray();
		for(int i=0;i<a.length;i++) {
			//z=1;
			//System.out.println(a[i]+" ");
			for (int j=1;j<a.length;j++) {
				if(a[i]==a[j]&&i!=j) {
					//z++;
					System.out.println(a[i]);
				break;
				}
			}
			
			
		}
		
	}}
