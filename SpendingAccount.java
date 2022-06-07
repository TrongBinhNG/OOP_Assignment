package Test;

public class SpendingAccount extends Account implements HasInterest{
	int balance;
	String name;
	//getter
	public int getBalance() {
    	return balance;
    }
    public String getName() {
    	return name;
    }
    //setter
    public void setName(String Name) {
    	this.name = Name;
    }
    public void setBalance(int Balance) {
    	this.balance = ((Balance >= 0) ? Balance : 0);	
    }
	public SpendingAccount(String name,int balance) {
		super(name,balance);
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
	@Override
	public void Output() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void UpdateBalance() {
		// TODO Auto-generated method stub
		
	}
}
