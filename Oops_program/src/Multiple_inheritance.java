class grand_father{
	void show1() {
		System.out.println("im show function in grade_father class");
	}
}
class father extends grand_father
{
	void show2()
	{
		System.out.println("im show fucntion in father class");
	}
}

class son extends father
{
	void show3() {
		System.out.println("im show fucntion in son class");
	}
}

class grand_son extends son
{
	void show4() {
		System.out.println("im show fucntion in grand_son class");
	}
}

public class Multiple_inheritance {

	public static void main(String[] args) {
		grand_son gs=new grand_son();
		gs.show4();
		gs.show3();
		gs.show2();
		gs.show1();

	}

}
