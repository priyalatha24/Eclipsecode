import java.util.Scanner;

public class Greatestsmallest_Indexfind {

	public static void main(String[] args) {
		//find n numbers .smallest and largest number and print index
		
         Scanner s=new Scanner(System.in);
         System.out.print("Enter the value :");
         int n=s.nextInt();
         System.out.println("enter the array from the user : ");
         int arr[]=new int[n];
         int num_idx=0,max_idx=0;
         for(int i=0;i<n;i++) {
        	 arr[i]=s.nextInt();
         }
         for(int i=1;i<n;i++) {
        	 if(arr[i]<arr[max_idx])
                 max_idx=i;
                 else if(arr[i]>arr[max_idx])
                	 max_idx=i;
                 System.out.println("smallest and largest numeber is : "+(max_idx)+" "+(max_idx));

         }
	}

}
