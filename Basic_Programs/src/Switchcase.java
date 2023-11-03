import java.util.Scanner;

public class Switchcase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the grade:");
		char ch = scan.next().charAt(0);
		switch(ch)
		{
		case'A':System.out.println("Excellents!");
		break;
		case'B':
		case'C':System.out.println("Well done");
		break;
		case'D':
		System.out.println("You passed");
		case'F':
		System.out.println("Better try again ");
		break;
			
		default:
			System.out.println("Invalid grade");
		}
			System.out.println("Your gradeis "+ch);
	}

}
