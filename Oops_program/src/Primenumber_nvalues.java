
import java.util.Scanner;

public class Primenumber_nvalues {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number=2;
		System.out.print("Enter n value:");
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(2+" ");
				number++;
			}
			else {
				task:
			for(int j=2;j<=number/2;j++) {
				if(number%j==0) {
					number++;
					continue task;
					}
					
			}
				System.out.print(number++ +" ");
			
	}
	}

}}
