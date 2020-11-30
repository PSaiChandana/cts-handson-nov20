package java8;

import java.util.HashSet;

public class TestHashSet {
	
	public static void main(String[] args) {
		HashSet<Account> set = new HashSet<>();
		for(int i=1;i<=10;i++) {
			Account account = new Account(i,"Test "+i);
			set.add(account);
			
		}
		set.stream().forEach(item->System.out.println(item));
	}

}
