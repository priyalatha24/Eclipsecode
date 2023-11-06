package Problem;


import java.util.*;

public class ArrayMaxMin {

	    public static void main(String[] args) {
	    	Scanner s= new Scanner(System.in);
			int n=s.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=s.nextInt();
						}
			
			
				for(int i=1;i<n-1;i++) {
					int first=a[i-1];
				 int last=a[n-1];

					if(first>a[i])
						System.out.print(first);
					
					else if(last>a[n-2])
						System.out.print(last);
					break;
				}
					for(int i=1;i<n-1;i++) {
					if((a[i]>a[i-1])&&(a[i]>a[i+1])) {
					System.out.println(a[i]);
					break;
				}
			}
		}

	}

