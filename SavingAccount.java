package Test;

import java.time.LocalDate;


public class SavingAccount {
	private int balance;
	private String name;
	private double interest;
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
	public void Deposit(int amount) {
		this.balance = balance + amount;
		System.out.printf("\n%s balance after deposit: %d$",name,balance);
	}
	public void Withdraw(int amount) {
		int remain = this.balance - amount;
		if(remain < 0) {
			System.out.printf("\n%s balance is not enough for the withdraw",name);
		}else {
			this.balance -= amount;
			System.out.printf("\n%s balance after withdraw: %d$",name,balance);
		}
	}
	public void UpdateBalance() {
		float Balance;
		Balance = (float)balance + (float)balance*(float)interest/100;
		this.date = date.plusDays(366);
		this.balance = Math.round(Balance);
		System.out.printf("\n%s balance: %d$ (%s)",name,balance,date.toString());
	}
}
	
