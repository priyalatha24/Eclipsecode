import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		//Perfect square 
		Scanner s= new Scanner(System.in);
		s.useDelimiter("[\\s]+");
		int check=0;
		int n=s.nextInt();
		int m=s.nextInt();
		int arr[]=new int[n];
		if(n==m)
		System.out.println("Yes");
		else
		System.out.println("No");
		s.close();

	}

}
