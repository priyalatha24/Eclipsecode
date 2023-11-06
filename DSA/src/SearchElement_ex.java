import java.util.Scanner;

public class SearchElement_ex {

	public static void main(String[] args) {
		//Search elements 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array elements:");
		int n = s.nextInt();
		int arr[]=new int[n+1];
		System.out.println("Enter the all the elements : "); 
		
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		// finding the elemnts you want 
		System.out.println("Enter the position ypu wnat to search: ");
		int search =s.nextInt();
		int count =0;
		
		for(int i=0;i<n;i++)
			if(arr[i]==search) {
				count++;
				System.out.printf("Enter the elemnts : "+search,i+1);
			}
		if(count==0)
			System.out.println("Search elements is not present ");

	}

}
