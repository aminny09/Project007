package apps;

public class Bank {
	int balance;
	
	public Bank(int amo) {
		this.balance=amo;
	}

	public int getBalance() {		
		return balance;
		
	}
	public  void deposit(int amount) {
		balance=balance+amount;		
	}
	public void withDraw(int money) {
		balance=balance-money;		
	}
}
