package Arrays;

import java.util.Scanner;

public class Two_number_operation {

	public static void main(String[] args) {
		// 2 number to perform operation 
		Scanner s=new Scanner(System.in);
		int n,m,K;
		System.out.print("Enter the first number : ");
		n=s.nextInt();
		System.out.print("Enter the second number: ");
		m=s.nextInt();
		System.out.print("choose the opertion you want to perform");
		System.out.println("choose 1 for addition");
		System.out.println("choose 2 for subtraction");
		System.out.println("choose 3 for muiltiplication");
		System.out.println("choose 4 for Divison");
		System.out.println("choose 5 for modulus");
		System.out.println("choose 6 for exit");
		K=s.nextInt();
		while(true) {
		switch(K) {
		case 1:
			System.out.println(n+m);
		break;
		case 2:
			System.out.println(n-m);
		break;
		
		case 3:
			System.out.println(n*m);
		break;
		
		case 4:
			System.out.println(n/m);
		break;
		case 5:
			System.out.println(n%m);
		break;
		case 6:
			System.exit(0);
		break;
		
		}
	
		}
	}
}

