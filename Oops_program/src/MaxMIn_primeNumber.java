import java.util.Scanner;

public class MaxMIn_primeNumber {

	public static void main(String[] args) {
		// find min max in range of prime number in between range 
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the max value: ");
		int max = s.nextInt();
		System.out.println("Enter the min value :");
		int min = s.nextInt();
		System.out.println("Prime number are: ");
		
		for(int n=min;n<=max;n++) {
				int count = 0;
				for (int i = 2; i<=n/2;i++) {
					if(n%i==0) {
						count++;
					
				//System.out.println(n+"is  not a prime number");
				break;
			}
		}
		if(count==0 && n!=1)
			System.out.println(n+" ");
		}
		s.close();

	}

}
