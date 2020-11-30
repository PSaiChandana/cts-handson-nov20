package exercise;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		int entry=0;
		AccountService accountService = new AccountService();
		do {
			System.out.println("Menu:/n 1.Add Account\n 2. Remove Account by acc no\n 3.Display account by account number\n 4.Display all accounts\n5.Display those account having the balance less than 1000\n6.exit");
			Scanner sc = new Scanner(System.in);
			entry = sc.nextInt();
			switch(entry) {
			case 1:System.out.println("Enter Account no");
					int accNo=sc.nextInt();
					System.out.println("enter account name:");
					String name=sc.next();
					System.out.println("enter accBalance");
					int accbalance= sc.nextInt();
				try {
					accountService.addAccount(new Account(accNo,name,accbalance));
				} catch (AccountAlreadyException e) {
					System.out.println("Duplicate account number");
				}
					break;
			case 2: System.out.println("Enter account no:");
				try {
					accountService.removeAccount(sc.nextInt());
				} catch (AccountNotFoundException e) {
					System.out.println("account not exist");
				}
					break;
			case 3: System.out.println("enter account by account no");
				try {
					accountService.getAccountByNo(sc.nextInt());
				} catch (AccountNotFoundException e) {
					System.out.println("account not exist");
				}
					break;
			case 4: accountService.getAllaccounts();
					break;
			case 5:accountService.getAccountswithLowBalnce();
					break;
			
			}
		}while(entry!=6);
	}
}
