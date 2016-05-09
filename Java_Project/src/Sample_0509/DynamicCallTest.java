package Sample_0509;

class Animals {
	void sound() {
		System.out.println("Animal Å¬·¡½ºÀÇ sound()");
	}
	void eat() {
		System.out.println("Animal Å¬·¡½ºÀÇ eat()");
	}
}

class Dog extends Animals {
	private int d = 11;
	void sound() {
		System.out.println("¸Û¸Û"+d);
	}
}

class Cat extends Animals {
	private int c = 99;
	void sound() {
		System.out.println("¾ß¿Ë"+c);
	}
}

public class DynamicCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals animal = new Animals();
		Dog dog = new Dog();
		Cat cat = new Cat();

		Animals obj;

		obj = animal;
		obj.sound();

		obj = dog;
		obj.sound();

		obj = cat;
		obj.sound();

		test(dog);
		test(cat);

	}

	static void test(Animals temp) {
		temp.sound();
	}
}
