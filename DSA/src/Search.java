 import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		// search elament 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elemnts : ");
		int n = s.nextInt();
		int arr[]=new int [n+1];   // array // always give n+1 as for extra space
		System.out.println("Enter the array elemnts one by one: ");
		
		for(int i=0;i<n;i++)        //elements 
			arr[i]=s.nextInt();
		
		// creating space for enter the position 
		System.out.println("enter the position you want to Search: ");
		int search = s.nextInt();
		int count = 0;
		
		for(int i=0;i<n;i++)  
			// printing n 
			if(arr[i]==search) {
				count++;
				System.out.printf("Eleemt %d found at position: %d\n",search,i+1);
			}
	
	if(count==0)
			System.out.print("Search elemets is not present ");
		s.close();
	}
}
 



