package Test;

import java.time.LocalDate;


public class SavingAccount {
	public int balance;
	public String name;
	public double interest;
	private LocalDate date = LocalDate.of(2021,10,23);
	
	//getter
    public int getBalance() {
    	return balance;
    };
    public double getInterest() {
    	return interest;
    }
    public String getName() {
    	return name;
    }
	public void setDate(LocalDate date) {
		this.date = date;
	}
    //setter
    public void setBalance(int Balance) {
    	this.balance = ((Balance >= 0) ? Balance : 0);	
    }
    public void setInterest(double Interest) {
    	this.interest = ((Interest >= 0) ? Interest : 0);
    }
    public void setName(String Name) {
    	this.name = Name;
    }
    public LocalDate getDate() {
		return date;
	}
    
	public SavingAccount(String name,int balance,double interest) {
		this.name = name;
		this.balance = balance;
		this.interest = interest;
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
		System.out.printf("\n%s balance after deposit: %d VND\n",name,balance);
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
		int remain = this.balance - (amount*converter);
		if(remain < 0) {
			System.out.printf("\n%s balance is not enough for the withdrawal",name);
		}else {
			this.balance -= (amount * converter);
			System.out.printf("\n%s balance after withdraw: %d VND",name,balance);
		}
	}
	public void UpdateBalance() {
		float Balance;
		Balance = (float)balance + (float)balance*(float)interest/100;
		this.date = date.plusDays(366);
		this.balance = Math.round(Balance);
		System.out.printf("\n%s balance: %d VND (%s)",name,balance,date.toString());
	}
	public void Output() {
		System.out.printf("\n%s's balance: %d VND",name,balance);
	}
}
	
