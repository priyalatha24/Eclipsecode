import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input values : ");
		int n = s.nextInt();
		
		int  sum =0;
		
		for (int i= 1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum>n)
			System.out.println("Abundant number");
		else
			System.out.println("not an Abundant number");

	}

}
