package Sample_0509;

class Bank {
	double getInteresteRate(){
		return 0.0;
	}
}
class Bad extends Bank{
	double getInteresteRate(){
		return 10.0;
	}
}
class Normal extends Bank{
	double getInteresteRate(){
		return 5.0;
	}
}
class Good extends Bank{
	double getInteresteRate(){
		return 3.0;
	}
}
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bad b1 =  new Bad();
		Normal b2 = new Normal();
		Good b3 =  new Good();
		System.out.println("Badbank의 이자율: "+b1.getInteresteRate());
		System.out.println("Normalbank의 이자율: "+b2.getInteresteRate());
		System.out.println("Goodbank의 이자율: "+b3.getInteresteRate());
		}

}
