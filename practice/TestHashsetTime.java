package java8;

import java.time.Duration;
import java.time.LocalTime;
import java.util.HashSet;

public class TestHashsetTime {

	public static void main(String[] args) {
		HashSet<Account> set = new HashSet<>();
		LocalTime before = LocalTime.now();
		for(int i=1;i<=100000;i++) {
			Account account = new Account(i,"Test "+i);
			set.add(account);
			System.out.println("item added " +i);
		}
		LocalTime after = LocalTime.now();
		System.out.println("time Taken "+Duration.between(before, after).toMillis());
		
	}
}
