package exercise;

public class Account {

	private int accountNo;
	private String name;
	private int accountBalance;
	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + ", accountBalance=" + accountBalance + "]";
	}
	public Account(int accountNo, String name, int accountBalance) {
		super();
		this.accountNo = accountNo;
		this.name = name;
		this.accountBalance = accountBalance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
