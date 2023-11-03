
public class CatPolymorphism extends AnimalPolymorphism{
	public void sound() {
		super.sound();  // calling the parents cls
		System.out.println("Meow");
	}

	public static void main(String[] args) {
		AnimalPolymorphism obj = new CatPolymorphism();
		obj.sound();
		
	}

}
