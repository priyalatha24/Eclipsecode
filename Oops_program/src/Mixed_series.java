import java.util.Scanner;

public class Mixed_series {

	public static void main(String[] args) {
		// Mixed series 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbr to generate the series : ");
		int n=s.nextInt();
		int fact, num=1;
		for(int i=0;i<n;i++) {
			fact=1;
			if(i%2==0)
				System.out.print(i+" ");
			else {
				for(int j=1;j<=num;j++) {
					fact=fact*j;
					}
				System.out.print(fact+" ");
				num++;
			}
		}
		s.close();

	}

}
