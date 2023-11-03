import java.util.Scanner;

public class Sum_number {

	public static void main(String[] args) {
		//sum the number 
		int n, r, sum=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no: ");
		n=s.nextInt();
		while(n>0) {
			r = n%10;
			// System.out.println(r);
			sum = sum +r;
			n=n/10;
		}
		System.out.println("sum= "+sum);
		s.close();
	}

}
