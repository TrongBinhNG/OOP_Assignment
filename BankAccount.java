
public class BankAccount {
	String name;
	int balance;
	void deposit(int dMoney) {
		balance += dMoney;
	}
	void withdraw(int wMoney) {
		if(balance< wMoney) System.out.println("Balance's not enough");
		else balance -= wMoney; 
	}
}
