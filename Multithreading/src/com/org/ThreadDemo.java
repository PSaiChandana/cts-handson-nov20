package com.org;

public class ThreadDemo {

	public static void main(String[] args) {

		Counter c= new Counter();
		Thread t1=new Thread(c, "A");
		Thread t2=new Thread(c,"B");
		
		t1.start();
		t2.start();
		System.out.println("program ended");
	}

}
