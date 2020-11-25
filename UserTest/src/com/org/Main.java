package com.org;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		List<User> list=new ArrayList<User>();
		Scanner in =new Scanner(System.in);
		
		list.add(new User(1,"Arun","arun456"));
		list.add(new User(2,"Rani","rani123"));
		list.add(new User(3,"Charan","charan789"));
		list.add(new User(4,"Dheer","dheer456"));
		list.add(new User(5,"kumar","kumar123"));
		
		for(User user: list) {
			if(user.getName().length()>5)
			System.out.println(user.getName());
		}
		}
	
	}

