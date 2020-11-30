package exercise;

import java.util.ArrayList;
import java.util.List;

public class AccountService {

	List<Account> accounts = new ArrayList<>();
	public void addAccount(Account a) throws AccountAlreadyException{
		for (Account account : accounts) {
			if(account.getAccountNo()==a.getAccountNo())
				throw new AccountAlreadyException();
		} 
		accounts.add(a);	
	}
	public void removeAccount(int num) throws AccountNotFoundException {
		Account resaccount = null;
		for (Account account : accounts) {
			if(account.getAccountNo()==num)
				resaccount=account;
		}
		if(resaccount==null)
			throw new AccountNotFoundException();
		else {
			for (Account account : accounts) {
				if(account.getAccountNo()==num)
					accounts.remove(account);
			}}
		
	}
	public void getAccountByNo(int num) throws AccountNotFoundException {
		Account resaccount = null;
		for (Account account : accounts) {
			if(account.getAccountNo()==num)
				resaccount=account;
		}if(resaccount==null)
			throw new AccountNotFoundException();
		else
			System.out.println(resaccount);
	}
	public void getAllaccounts() {
		accounts.stream().forEach(item->System.out.println(item));
	}
	public void getAccountswithLowBalnce() {
		accounts.stream().forEach(item->{if(item.getAccountBalance()<1000) System.out.println(item);});
	}
	
}
