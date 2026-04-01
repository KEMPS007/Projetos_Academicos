package entites;

public class Cliente {
	
	private int accountNumber;
	private String accountHolder;	
	private double Balance;
	
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double Balance) {
		this.Balance = Balance;
	}
	
	
	public Cliente(int accountNumber,String accountHolder,double Balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.Balance = Balance;
		
	}
	public Cliente(int accountNumber,String accountHolder) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;		
		
	}
	
	public double deposit(double deposit) {
		return this.Balance += deposit;
	}
	
	public double withdraw(double withdraw) {
		return this.Balance -= withdraw + 5;
	}
}
