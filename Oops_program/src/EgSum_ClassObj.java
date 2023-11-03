
import java.io.*;
import java.util.*;

public class EgSum_ClassObj {
		// eg sum of bank account 
		static int Acc_id;
		static String Acc_name;
		static String Address;
		static long Contact;
		static int Deposit_amount;
		
		static void display(int Acc_id , String Acc_name,String Address,long Contact, int Deposit_amount) {
			System.out.println("User details");
			System.out.println("User Id: "+Acc_id);
			System.out.println("Student Name: "+Acc_name);
			System.out.println("Address: "+Address);
			System.out.println("Contact: "+Contact);
			System.out.println("deposit amount : "+Deposit_amount);
			

	}
		public static void main(String[] args) throws IOException{ // for data input string
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the User id : ");
			Acc_id = s.nextInt();
			System.out.print("Enter the account  name : ");
			Acc_name = s.next();
			System.out.println("Address : ");
			//Address = s.next();
			//s.nextLine();
			
			DataInputStream object = new DataInputStream(System.in);
		    Address = object.readLine();    // for address to wrt as both numbers and words 
			
			System.out.println("Contact : ");
			Contact = s.nextLong();
			System.out.println("Deposit_amount : ");
			Deposit_amount = s.nextInt();
			display(Acc_id,Acc_name,Address,Contact,Deposit_amount);
			s.close();
		}
}
