package Access_modifier;
class base{

	int stud_no=12;// stud no, stu name = state 
	public String stud_name="Nisha";
	void display()//display()-behavior
	{
		System.out.println("Student ID: "+stud_no);
		System.out.println("Student Name: "+stud_name);
	}
}

public class Private_Class {
	
	public static void main(String[] args) {
		// how to create obj 
	    base obj = new base ();
		System.out.println("Calling the method");
		obj.display();// calling the method .output =stud id = 12 , stu name =Nisha 
		System.out.println("Calling the state");// calling the state 
		System.out.println(obj.stud_name);
		

	}

}
