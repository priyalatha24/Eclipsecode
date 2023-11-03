class parents
{
	void show() {
		System.out.println("we are parenst");
	}
}

class son1 extends  parents
{
	void disp() {
		System.out.println("im  son class");
	}
}

class daughter extends  parents
{
	void disp() {
		System.out.println("im  daugher class");
	}
}

public class Hierarchy {

	public static void main(String[] args) {
		son1 s=new son1();
		daughter d =new daughter();
		s.show();
		d.show();
		s.disp();
		d.disp();
	}

}
