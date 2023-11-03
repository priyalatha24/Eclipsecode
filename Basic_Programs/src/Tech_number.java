import java.util.Scanner;

public class Tech_number {

	public static void main(String[] args) {
		// Tech number 
		
		Scanner s = new Scanner(System.in);
		int n , result;
		n = s.nextInt();
		System.out.print("Enter n = ");
		
		/*
		if (s.hasNextInt() || s.hasNextDouble()) {
            System.out.println("2025 is a tech  number.");
        } else {
            System.out.println("It's not a number.");
        }

        s.close();
        */
		String str1 =String.valueOf(n);// convert into string then we can print 4 digit or any value of number  
		if(str1.length ()==4) {
			result = (int)Math.pow((n/100)+ (n%100),2);
			if(n==result)
				System.out.println(n+"is a tech number");
		    else 
			    System.out.println(n+"Not a tech  number");

	}
	else
		System.out.println("Not a valid number ");
	s.close ();
	
		}

}

