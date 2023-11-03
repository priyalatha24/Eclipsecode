class ClassFirst{
	public void display() {
		System.out.println("Class First: display");
	}
	public void show() {
		System.out.println("Class First:show");
	}
}
 class ClassSecond extends ClassFirst{
	// overriden method display()

	public void display() {
		System.out.println("Class second:display");
	}
	//cannot override with different accces  specifier 
	// protected void show (){}
	public void show() {
		System.out.println("Class second: show");
	}
 }
class Use1st2ndPolymorphism{
	public static void main(String[] args) {
		ClassSecond cs = new ClassSecond();
		cs.display();
		cs.show();

	}
}

