package Test;

public class Account {
	int balance;
	String name;
	public int getBalance() {
    	return balance;
    };
	public Account(String name,int balance) {
		this.name = name;
		this.balance = balance;
	}
	public void Deposit(int amount,String currency) {
		int converter = 0;
		switch(currency) {
		case "USD":
			converter = 22970;
			break;
		case "VND":
			converter = 1;
			break;
		case "EURO":
			converter = 24560;
			break;
		case "RUB":
			converter = 309;
			break;
		}
		this.balance = balance + (amount * converter);
		System.out.printf("\n%s balance after deposit: %d VND",name,balance);
	}
	public void Withdrawal(int amount,String currency) {
		int converter = 0;
		switch(currency) {
		case "USD":
			converter = 22970;
			break;
		case "VND":
			converter = 1;
			break;
		case "EURO":
			converter = 24560;
			break;
		case "RUB":
			converter = 309;
			break;
		}
		int remain = this.balance - (amount * converter);
		if(remain < 0) {
			System.out.printf("\n%s balance is not enough for the withdrawal",name);
		}else {
			this.balance -= (amount * converter);
			System.out.printf("\n%s balance after withdraw: %d VND",name,balance);
		}
	}
	public void Output() {
		System.out.printf("\n%s's balance: %d VND",name,balance);
	}

}
