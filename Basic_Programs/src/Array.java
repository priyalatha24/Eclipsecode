import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		//array value declare in integer 
		int n; // number of array elaemnts= 5 
		Scanner s = new Scanner(System.in);
		System.out.println("Enter tthe numner of elements: ");
		n = s.nextInt();//n=5
		int arr[] = new int[n];// int arr[] = new int [5]; = integer array 
		//String array1[] = new string[n]; |this is for string 
		System.out.println("Enter the array element one by one: ");
		for(int i =0;i<n;i++) { //0 to 4 = 5
			arr[i]=s.nextInt();//arr[0] = 10, | for string chnage array1[i]
		}
		System.out.println("output : ");
		for(int i=0; i<n;i++) { // 0 to 5= 6
			System.out.println(arr[i]);// for string -give array1[1]  here all array1 is string any word can use .
			
		}
	}

}
