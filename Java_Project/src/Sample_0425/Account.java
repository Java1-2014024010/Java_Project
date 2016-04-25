package Sample_0425;

public class Account {
	private int regNumber;
	private String name;
	private int balance;

	Account(int regNumber, String name, int balance) {
		this.regNumber = regNumber;
		this.name = name;
		this.balance = balance;
	}

	// Áß¿ä
	// Account() {this(1,"2",1000);}
	Account() {
		regNumber = 1;
		name = "2";
		balance = 10000;
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}
