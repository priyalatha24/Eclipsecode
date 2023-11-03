package Looping;

public class Arrays {

	public static void main(String[] args) {
		// arrays 
		int arr[]= {10,20,30,40,50};// integer array   
		for(int i =0; i<arr.length;i++) { 
			System.out.println(arr[i]);
		}
		//for each loop 
		System.out.println("For each loop :");
		for(int a:arr) {
			System.out.println(a);
		}
		System.out.println(arr);//gives obj refrence 

	}
  
}


