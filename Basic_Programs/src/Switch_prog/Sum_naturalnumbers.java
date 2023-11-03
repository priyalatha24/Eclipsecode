package Switch_prog;

import java.util.Scanner;

public class Sum_naturalnumbers {

	public static void main(String[] args) {
		// Sum of natural numbers 
		int n, sum=0;// n- any number or integer value 
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value:");
		n=s.nextInt();
		for(int i=1;i<=n;i++) { // i= -10,i<=n;i++  output:-45
			sum=sum+i;
		}
		System.out.println(sum);

	}

}
