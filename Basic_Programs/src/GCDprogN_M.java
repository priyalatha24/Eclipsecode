import java.util.Scanner;

public class GCDprogN_M {

	public static void main(String[] args) {
		//gcd of n,m 
		//int n1=10 ,n2=5;
		Scanner s= new Scanner(System.in);
		s.useDelimiter("[\\s]+");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int gcd=1;
		for (int i=1;i<=n1;i++) {
			if(n1%i==0&&n2%i==0)
				gcd=i;
		}
		//System.out.println("GCD of "+n1+" and "+n2+"is"+gcd);
if(gcd==1)
	System.out.print("-1");
else
	System.out.print(gcd);
	}

}
