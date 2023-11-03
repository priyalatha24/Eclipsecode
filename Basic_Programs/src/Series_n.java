import java.util.Scanner;

public class Series_n {

	public static void main(String[] args) {
		// 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int result = 1;
		int temp=0;
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			temp=i*i;
			//result=temp+1;
			temp++;
			//System.out.print(result+" ");
			System.out.print(temp+" ");
		}
	}

}
