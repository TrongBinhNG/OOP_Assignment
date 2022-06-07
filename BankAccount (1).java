
public class BankAccount {
	String name;
	int balance;
	void setData(String name,int balance) {
		this.name = name;
		this.balance = balance;
	}
	void deposit(int dMoney) {
		balance += dMoney;
	}
	void withdraw(int wMoney) {
		if(balance< wMoney) System.out.println("Balance's not enough");
		else balance -= wMoney; 
	}
	void display() {
		System.out.print("Account Name "+ name);
		System.out.println("\nBalance = "+ balance);
	}
}
