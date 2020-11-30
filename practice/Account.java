package java8;

public class Account {

	private int accountNo;
	private String name;
	public Account(int accountNo, String name) {
		super();
		this.accountNo = accountNo;
		this.name = name;
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
	public Account() {
	}
	public int hashcode() {
		return 210;
	}
	public boolean equals(Object object) {
		Account account = (Account) object;
		if(this.accountNo== account.accountNo)
			return true;
		return false;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", name=" + name + "]";
	}
	
}
