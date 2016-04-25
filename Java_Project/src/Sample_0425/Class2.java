package Sample_0425;

import java.util.Scanner;

public class Class2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		Class1 cc = new Class1();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("1. Input String");
			System.out.println("2. Input Number");
			System.out.println("3. Quit");
			System.out.print("Input menu number : ");
			menu = input.nextInt();

			if (menu == 1)
				cc.function1();
			else if (menu == 2)
				cc.function2();
			else if (menu == 3)
				System.out.println("You missed");
			else
				System.out.println("Re-input menu number");

		} while (menu != 3);

	}

}
