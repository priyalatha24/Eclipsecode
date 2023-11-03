package Arrays;

import java.util.Scanner;

public class SortingArray_ascendingoder {

	public static void main(String[] args) {
		// Sorting array ascending 
		Scanner s =new Scanner(System.in);
		int n, temp;
		System.out.print("ENther the array size : ");
		n=s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elemets one by one :");
		for(int i=0;i<n;i++)
			arr[i] = s.nextInt();
		
		// Sorting the elemts 
		for(int i=0;i<n-1;i++) {  // n-1 => i<n means no values to compare after n so its is n-1
			for(int j=i+1;j<n;j++) {   // i+1 indicates next value of i
				if (arr[i]>arr[j]) {       //these are compareing blocks 
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}
			}
		}
		//Printing tbe array after sorting 
		System.out.println("After sorting array elaments are: ");
		for(int i=0;i<n;i++)
			/*for descending just change the ==> for(int i=n-1;i>=0;i--)
			 * s.o.p(arr[i]	+" ")		 */
			System.out.print(arr[i]+" ");
		s.close();
	}

}
