
public class HorsePlymorphism extends AnimalPolymorphism{ // extends should wrt here to connect animalpolymorphism .this is for override
	public void sound() {
		super.sound();  // calling the parents cls
		System.out.println("Neigh");
	}

	public static void main(String[] args) {
		AnimalPolymorphism obj = new HorsePlymorphism();
		obj.sound();
	}

}
