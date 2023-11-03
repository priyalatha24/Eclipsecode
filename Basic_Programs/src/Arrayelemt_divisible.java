import java.util.Scanner;

public class Arrayelemt_divisible {

	

	public static void main(String[] args) {
		//sum of all number divisible by 2, 3, 5 
		Scanner s = new Scanner(System.in);
		int sum=0;
		System.out.print("Enter array size:");
		 int n=s.nextInt();
		System.out.println("Read array Elements from user:");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			//System.out.print("Enter array element of index "+i+":");
			arr[i]=s.nextInt();
				}
		
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			
		}
		if(n%2==0 && n%3==0 && n%5==0)
			System.out.println("printing 1 ");
		else
			System.out.println("printing 0 ");

	}

}
