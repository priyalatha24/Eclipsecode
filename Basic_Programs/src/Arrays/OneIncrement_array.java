package Arrays;

import java.util.Scanner;

public class OneIncrement_array {

	public static void main(String[] args) {
		// Array one increment
		Scanner s=new Scanner(System.in);
		int n;                                   // input 5 = 10 20 30 40 50 o/p 11 21 31 41 51
		n=s.nextInt();
		int arr[]=new int[n];
		for (int i=0; i < n; i++) 
			arr[i]=s.nextInt()+1;
		
		for(int i=0;i<n;i++) {
			//arr[i]+=1
					System.out.print(arr[i]+" ");
			
		}
		
		//------------------------------
		/*Scanner s=new Scanner(System.in);
		int n;                                   // input 5 = 5 -10 15 -20 25 o/p 6 -9 16 -19 26
		n=s.nextInt();
		int arr[]=new int[n];
		for (int i=0; i < n; i++) 
			arr[i]=s.nextInt()+1;
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}*/
		s.close();

	}

}
