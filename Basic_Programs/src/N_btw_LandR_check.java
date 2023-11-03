import java.util.Scanner;

public class N_btw_LandR_check {

	public static void main(String[] args) {
		// 3number N,L,R print yes . if N is between L and R else print no 
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.useDelimiter("[\\s]+");
		int l=s.nextInt();
		int r=s.nextInt();
		//int arr[]=new int[n];
		/*for(int i=0;i<r;i++) 
			for(n=l;n<r;n++) {
				arr[i]=l++;
			if(arr[i]==n) 
				check++;
			System.out.println("Yes");
			break;
			}
			if(check==0)
			System.out.println("No");*/
		if(n>=l&&n<=r) {
		System.out.println("Yes");
		}
		else
			System.out.println("No");
			s.close();

		}
		
	
	}


	


