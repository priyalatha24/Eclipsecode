package Switch_prog;

import java.util.Scanner;

public class First_Switch {

	public static void main(String[] args) {
		// Switch prog of stud id 
		int stud_id,mark1,mark2,mark3;
		String stud_name;
		float total,avg;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the student id :");
		stud_id = s.nextInt();
		System.out.println("Enter the Student name:");
		stud_name = s.next();
		System.out.println("enter the mark1: ");
		mark1=s.nextInt();
		System.out.println("enter the mark2: ");
		mark2=s.nextInt();
		System.out.println("enter the mark3: ");
		mark3=s.nextInt();
		total = mark1+mark2+mark3;
		avg = total/3;
		
	
	}

}
