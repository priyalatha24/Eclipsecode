import java.util.Scanner;

public class ElementExistNK {

	public static void main(String[] args) {
		// 2numbers N,K followed by elements of N . print YES if k exitselse print NO 
		Scanner s = new Scanner(System.in);
		int check=0;
		s.useDelimiter("\\s+");
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		if(arr[i]==k) 
			check++;
		System.out.println("Yes");
		break;
		}
		if(check==1)
		System.out.println("No");
		s.close();
	}
		}
		
	
		


