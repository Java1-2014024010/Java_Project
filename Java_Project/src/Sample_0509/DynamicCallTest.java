package Sample_0509;

abstract class Animals {
	abstract void sound(); 
}

class Dog extends Animals {
	private int d = 11;
	@Override
	void sound() {
		System.out.println("港港"+d);
	}
}

class Cat extends Animals {
	private int c = 99;
	@Override
	void sound() {
		System.out.println("具克"+c);
	}
}

public class DynamicCallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals dog= new Dog();
		Animals cat = new Cat();
		dog.sound(); cat.sound();
		test(dog); test(cat);
	}

	static void test(Animals temp) {
		temp.sound();
	}
}
