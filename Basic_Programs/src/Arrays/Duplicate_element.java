package Arrays;

import java.util.Scanner;

public class Duplicate_element {

	public static void main(String[] args) {
		// Dupliacte number 
		Scanner s=new Scanner(System.in);
		int n,flag=0; // assume switch is flag 
		n =s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j])
					System.out.print(arr[i]+" ");
				    flag=1;
			}
		}
		if(flag==0)
			System.out.println("No dupliactes");
		s.close();
		

	}

}
