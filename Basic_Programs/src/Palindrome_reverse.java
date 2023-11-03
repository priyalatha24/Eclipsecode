import java.util.Scanner;

public class Palindrome_reverse {

	public static void main(String[] args) {
		// palindrome reverse 
		int n, r, reverse=0,temp;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no: ");
		n=s.nextInt();
		temp=n;
		while(n>0) {
			r = n%10;
			// System.out.println(r)
			reverse = reverse*10+r;
			n=n/10;
		}
		//System.out.println("reverse= "+reverse);
		//System.out.println("reverse ="+reverse);
		if(temp==reverse)// insted of n copare with temp it gives value in out put 
			System.out.println("plaindrome");
		else
			System.out.println("Not a palindrome");
		s.close();

	}

}
