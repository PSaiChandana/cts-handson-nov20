package com.cts.model;

public class Wallet {

	private String name;
	private double balance;
	public Wallet(){
		balance=1000;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
