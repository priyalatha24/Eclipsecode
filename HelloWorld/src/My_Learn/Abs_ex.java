package My_Learn;

public class Abs_ex {
	interface Animal{
		public default void makeSound() {
	}
		class Cat implements Animal{
			public void makeSound() {
				System.out.println("meow");
			}
		}
		
		class Dog implements Animal{
			public void makeSound() {
				System.out.println("Woof");
			}
		}
public class InterfaceExample{
	public static void main(String[] args) {
		Animal myCat = new Cat();
		Animal myDog = new Dog();
		myCat.makeSound();
		myDog.makeSound();
		

	}

}}}
