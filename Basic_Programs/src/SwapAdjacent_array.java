import java.util.Scanner;

public class SwapAdjacent_array {

	public static void main(String[] args) {
		// Swap the adjacent elements in array 
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();	
		}
		if(n%2==0)
		for(int i=0;i<n;i+=2) {
			System.out.print(arr[i+1]+" "+arr[i]+" ");	
	}
		else {
			for(int i=0;i<n-1;i+=2) 
				System.out.print(arr[i+1]+" "+arr[i]+" ");	
		}
		System.out.println(arr[n-1]);
	}

}
