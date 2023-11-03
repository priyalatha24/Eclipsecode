package Switch_prog;

import java.util.Scanner;

public class ifelseif_switch {

	public static void main(String[] args) {
		// if else if 
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
		if(avg >= 90)
			System.out.println("Excellnet");
		else if(avg>= 70)
			System.out.println("Very good");
		else if(avg>= 70)
			System.out.println("Good");
		else if(avg>= 70)
			System.out.println("Improve");
		else if(avg>= 70)
			System.out.println("Work hard ");
		else if(avg>= 70)
			System.out.println("Fail");
		else 
			System.out.println("Not Eligible ");

	}

}
