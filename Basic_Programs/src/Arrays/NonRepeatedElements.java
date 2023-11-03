package Arrays;

import java.util.Scanner;

public class NonRepeatedElements {

	public static void main(String[] args) {
		// Nonrepeated elaments (non duplicate number )
		Scanner s = new Scanner(System.in);
		int n,count,flag=0;
		System.out.print("Enter the size of array : ");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elaments : ");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.println("The elements are: ");
		for(int i=0;i<n-1;i++) {
			count=0;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]&& i!=j) {
					count++;	
		}
		if(count==0){
			System.out.print(arr[i]+" ");
			flag = 1;}
		}
		if(flag==0)
			System.out.println("All elemnts are repeated : ");
		s.close();
		}
	
		}
}


