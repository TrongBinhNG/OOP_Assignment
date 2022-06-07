
public class week3 {
		public static void main(String args[]) {
			BankAccount obj = new  BankAccount();
			obj.setData("Hoang Trung Hieu",10000000);
			obj.deposit(5000000);
			obj.withdraw(5000000);
			obj.display();
			BankAccount obj1 = new BankAccount();
			obj1.setData("Nguyen Trong Binh",2000000);
			obj1.deposit(500000);
			obj1.withdraw(100000);
			obj1.display();
		}
		
	}


