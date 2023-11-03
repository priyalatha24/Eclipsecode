package Arrays;

import java.util.Scanner;

public class Try_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int n,r,reverse=0;
			Scanner s= new Scanner(System.in);
			n=s.nextInt();
			while(n!=0) {
				r=n%10;
				reverse =reverse*10+(++r);
				n=n/10;
				
			}
			while(reverse!=0) {
				r=reverse%10;
				System.out.print(r);
				reverse=reverse/10;
			}
			s.close();
			   
				
	}
	
}
