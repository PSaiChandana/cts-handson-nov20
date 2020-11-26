package com.org;

public class Counter implements Runnable{

	@Override
	public synchronized void run() {

		Thread t = Thread.currentThread();
		for(int i=1;i<=100;i++)
		{
			System.out.println("counter :"+i+",name :"+t.getName());
		}
		
	}

}
